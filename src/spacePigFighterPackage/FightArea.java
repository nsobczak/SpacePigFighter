package spacePigFighterPackage;

import java.util.Scanner;
import animalPackage.Animal;
import playerPackage.Player;

/**
 * ===== Class FightArea =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.05, 11/2016
 */
public class FightArea implements ExecutionInterface {

	private Animal animal_player_01;

	private Animal animal_player_02;

	private final String[] ACTION = { "", "Attack", "AnnuleDamages",
			"MoreDamages", "Paralyse", "TripleAttack", "Fly" };

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 Player = player_01
	 * @param 1 Player = player_02
	 */
	public FightArea(Player player_01, Player player_02) {
		this.animal_player_01 = player_01.getAnimal();
		this.animal_player_02 = player_02.getAnimal();
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get FighteArea animal_player_01
	 * 
	 * @return Animal animal_player_01
	 */
	public Animal getAnimalPlayer01() {
		return this.animal_player_01;
	}

	/**
	 * Get FighteArea animal_player_02
	 * 
	 * @return Animal animal_player_02
	 */
	public Animal getAnimalPlayer02() {
		return this.animal_player_02;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set FighteArea animal_player_01
	 * 
	 * @param Animal
	 *            new_animal_player_01
	 */
	public void setAnimalPlayer01(Animal new_animal_player_01) {
		this.animal_player_01 = new_animal_player_01;
	}

	/**
	 * Set FighteArea animal_player_02
	 * 
	 * @param Animal
	 *            new_animal_player_02
	 */
	public void setAnimalPlayer02(Animal new_animal_player_02) {
		this.animal_player_02 = new_animal_player_02;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * run() : function which gives the result
	 * 
	 */
	public String run() {
		String result;

		// Initialize stuff
		this.getAnimalPlayer01().stuffSelection();
		this.getAnimalPlayer02().stuffSelection();

		loop();
		// Check the result
		if ((this.getAnimalPlayer01().getLife() <= 0)
				&& (this.getAnimalPlayer02().getLife() <= 0)) {
			result = "both animal are dead | draw";
		} else {
			if (this.getAnimalPlayer01().getLife() <= 0) {
				result = this.getAnimalPlayer01().getPSEUDO() + " is dead | "
						+ this.getAnimalPlayer02().getPSEUDO()
						+ " is the winner";
			} else {
				result = this.getAnimalPlayer02().getPSEUDO() + " is dead | "
						+ this.getAnimalPlayer01().getPSEUDO()
						+ " is the winner";
			}
		}
		return result;
	}

	/**
	 * loop() : main function
	 * 
	 */
	private void loop() {
		boolean deadAnimalFound = false;

		while (!deadAnimalFound) {
			String actionPlayer01 = new String();
			String actionPlayer02 = new String();

			// Player01 action
			System.out.println("\n--" + this.getAnimalPlayer01().getPSEUDO()
					+ "--");
			if (this.getAnimalPlayer01().getAbleToAct()) {
				// player01 chooses its action
				actionPlayer01 = this.selectAttack(this.getAnimalPlayer01(),
						this.getAnimalPlayer02());
			} else {
				actionPlayer01 = "";
				System.out.println("You are not able to attack this turn !");
				this.getAnimalPlayer01().setAbleToAct(true);
			}

			// Player02 action
			System.out.println("\n--" + this.getAnimalPlayer02().getPSEUDO()
					+ "--");
			if (this.getAnimalPlayer01().getAbleToAct()) {
				// player02 chooses its action
				actionPlayer02 = this.selectAttack(this.getAnimalPlayer02(),
						this.getAnimalPlayer01());
			} else {
				actionPlayer02 = "";
				System.out.println("You are not able to attack this turn !");
				this.getAnimalPlayer02().setAbleToAct(true);
			}

			// solve the round
			solveRound(actionPlayer01, actionPlayer02);

			// print life
			System.out.println("\n==Calculation_of_life_points==");
			System.out.println(this.getAnimalPlayer01().getPSEUDO() + " has "
					+ this.getAnimalPlayer01().getLife() + " LP left." + "\n"
					+ this.getAnimalPlayer02().getPSEUDO() + " has "
					+ this.getAnimalPlayer02().getLife() + " LP left.");
			System.out.println("==============================");

			// check if one animal is dead
			if ((this.getAnimalPlayer01().getLife() <= 0)
					|| (this.getAnimalPlayer02().getLife() <= 0)) {
				deadAnimalFound = true;
			}
		}
	}

	/**
	 * selectAttack function
	 * 
	 * @param 2 Animal = animal of the actif player and animal of his nemesis
	 * @return String
	 */
	private String selectAttack(Animal animal_01, Animal animal_02) {
		// Create 1 player
		Scanner scan = new Scanner(System.in);
		int selectedAttack = 0;
		boolean attackSelectedAvailable = false;

		while (!attackSelectedAvailable) {
			System.out
					.println("Choose your action: \n1 normal attack | 2 special attack | 3 scream");
			String selectedAction = scan.nextLine();
			try {
				selectedAttack = Integer.parseInt(selectedAction);
				if ((selectedAttack >= 1) && (selectedAttack <= 3)) {
					attackSelectedAvailable = true;
				} else {
					System.out.println("Please enter a number between 1 and 2");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number");
			} catch (NullPointerException e) {
				System.out.println("Please enter a number");
			}
		}

		if (selectedAttack == 1) {
			animal_01.attack(animal_02);
			return "Attack";
		} else if (selectedAttack == 2) {
			String speAction = animal_01.specialAction(animal_02);
			if (speAction.equals("specialActionDamageAnnulation")) {
				return "AnnuleDamages";
			} else {

				if (speAction.equals("specialActionTripleAttack")) {
					return "TripleAttack";
				} else {

					if (speAction.equals("specialActionFly")) {
						return "Fly";
					} else {

						if (speAction.equals("specialActionMoreDamages")) {
							return "MoreDamages";
						} else {

							if (speAction.equals("specialActionParalyse")) {
								return "Paralyse";
							}
						}
					}
				}
			}
		} else {
			animal_01.scream();
		}
		return "";

		// scan.close(); // Ca merde quand on close => etrange !
	}

	/**
	 * solveRound function : function that solves the round of the fight after
	 * having choosen action
	 * 
	 * @param actionPlayer01
	 * @param actionPlayer02
	 */
	// ACTION = {0:"", 1:"Attack", 2:"AnnuleDamages", 3:"MoreDamages",
	// 4:"Paralyse", 5:"TripleAttack", 6:"Fly"}
	private void solveRound(String actionPlayer01, String actionPlayer02) {
		// Player1 action
		if (!(actionPlayer01.equals(this.ACTION[0]) || actionPlayer01
				.equals(this.ACTION[1]))) {
			if (actionPlayer01.equals(this.ACTION[2])
					&& actionPlayer02.equals(this.ACTION[1])) {
				int bonus = this.getAnimalPlayer02().getForce()
						- this.getAnimalPlayer01().getResistance();
				this.getAnimalPlayer01().increaseLife(bonus);
			} else {
				if (actionPlayer01.equals(this.ACTION[3])
						&& !actionPlayer02.equals(this.ACTION[2])
						&& !actionPlayer02.equals(this.ACTION[6])) {
					int damages = this.getAnimalPlayer01().getForce()
							- this.getAnimalPlayer02().getResistance();
					this.getAnimalPlayer02().decreaseLife(damages * 2);
				} else {
					if (actionPlayer01.equals(this.ACTION[4])
							&& !actionPlayer02.equals(this.ACTION[6])) {
						this.getAnimalPlayer02().setAbleToAct(false);
					} else {
						if (actionPlayer01.equals(this.ACTION[5])
								&& !actionPlayer02.equals(this.ACTION[2])
								&& !actionPlayer02.equals(this.ACTION[6])) {
							int damages = this.getAnimalPlayer01().getForce()
									- this.getAnimalPlayer02().getResistance();
							this.getAnimalPlayer02().decreaseLife(damages * 3);
							this.getAnimalPlayer01().setAbleToAct(false);
						} else {
							if (actionPlayer01.equals(this.ACTION[6])
									&& actionPlayer02.equals(this.ACTION[1])) {
								int bonus = this.getAnimalPlayer02().getForce()
										- this.getAnimalPlayer01()
												.getResistance();
								this.getAnimalPlayer01().increaseLife(bonus);
							}
						}
					}

				}
			}
		}

		// Player2 action
		if (!(actionPlayer02.equals(this.ACTION[0]) || actionPlayer02
				.equals(this.ACTION[1]))) {
			if (actionPlayer02.equals(this.ACTION[2])
					&& actionPlayer01.equals(this.ACTION[1])) {
				int bonus = this.getAnimalPlayer01().getForce()
						- this.getAnimalPlayer02().getResistance();
				this.getAnimalPlayer02().increaseLife(bonus);
			} else {
				if (actionPlayer02.equals(this.ACTION[3])
						&& !actionPlayer01.equals(this.ACTION[2])
						&& !actionPlayer01.equals(this.ACTION[6])) {
					int damages = this.getAnimalPlayer02().getForce()
							- this.getAnimalPlayer01().getResistance();
					this.getAnimalPlayer01().decreaseLife(damages * 2);
				} else {
					if (actionPlayer02.equals(this.ACTION[4])
							&& !actionPlayer01.equals(this.ACTION[6])) {
						this.getAnimalPlayer01().setAbleToAct(false);
					} else {
						if (actionPlayer02.equals(this.ACTION[5])
								&& !actionPlayer01.equals(this.ACTION[2])
								&& !actionPlayer01.equals(this.ACTION[6])) {
							int damages = this.getAnimalPlayer02().getForce()
									- this.getAnimalPlayer01().getResistance();
							this.getAnimalPlayer01().decreaseLife(damages * 3);
							this.getAnimalPlayer02().setAbleToAct(false);
						} else {
							if (actionPlayer02.equals(this.ACTION[6])
									&& actionPlayer01.equals(this.ACTION[1])) {
								int bonus = this.getAnimalPlayer01().getForce()
										- this.getAnimalPlayer02()
												.getResistance();
								this.getAnimalPlayer02().increaseLife(bonus);
							}
						}
					}
				}
			}
		}
	}

}