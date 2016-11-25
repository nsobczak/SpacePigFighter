package spacePigFighterPackage;

import java.util.Scanner;
import animalPackage.Animal;
import playerPackage.Player;

/**
 * ===== Class FightArea =====
 * 
 * @author Nicolas Sobczak
 * @version 1.03, 11/2016
 */
public class FightArea implements ExecutionInterface {

	private Animal animal_player_01;

	private Animal animal_player_02;

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
	 * Get FighteArea's animal_player_01
	 * 
	 * @return animal_player_01
	 */
	public Animal getAnimalPlayer01() {
		return this.animal_player_01;
	}

	/**
	 * Get FighteArea's animal_player_02
	 * 
	 * @return animal_player_02
	 */
	public Animal getAnimalPlayer02() {
		return this.animal_player_02;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set FighteArea's animal_player_01
	 * 
	 * @param Animal
	 *            new_animal_player_01
	 */
	public void setAnimalPlayer01(Animal new_animal_player_01) {
		this.animal_player_01 = new_animal_player_01;
	}

	/**
	 * Set FighteArea's animal_player_02
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
		if ((this.getAnimalPlayer01().getLife() < 0)
				&& (this.getAnimalPlayer02().getLife() < 0)) {
			result = "both animal are dead | draw";
		} else {
			if (this.getAnimalPlayer01().getLife() < 0) {
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
			if (this.getAnimalPlayer01().getAbleToAct()) {
				// player01 chooses its action
				System.out.println("\n--"
						+ this.getAnimalPlayer01().getPSEUDO() + "--");
				actionPlayer01 = this.selectAttack(this.getAnimalPlayer01(),
						this.getAnimalPlayer02());
			} else {
				actionPlayer01 = "";
			}

			// Player02 action
			if (this.getAnimalPlayer01().getAbleToAct()) {
				// player02 chooses its action
				System.out.println("\n--"
						+ this.getAnimalPlayer02().getPSEUDO() + "--");
				actionPlayer02 = this.selectAttack(this.getAnimalPlayer02(),
						this.getAnimalPlayer01());
			} else {
				actionPlayer02 = "";
			}

			// solve the round
			if (actionPlayer01.equals("") || actionPlayer01.equals("Attack")) {
				continue;
			} else {
				if (actionPlayer01.equals("AnnuleDamages")
						&& actionPlayer02.equals("Attack")) {
					// on increase de la difference entre forcePlayer02 et
					// defencePlayer01
				}
			}
			if (actionPlayer02.equals("")) {
				continue;
			} else {
				if (actionPlayer02.equals("")) {

				}
			}
			// print the life
			System.out.println("\n==Calculation_of_life_points==");
			System.out.println(this.getAnimalPlayer01().getPSEUDO() + " has "
					+ this.getAnimalPlayer01().getLife() + " LP left." + "\n"
					+ this.getAnimalPlayer02().getPSEUDO() + " has "
					+ this.getAnimalPlayer02().getLife() + " LP left.");
			System.out.println("==============================");
			// check if one animal is dead
			if ((this.getAnimalPlayer01().getLife() < 0)
					|| (this.getAnimalPlayer02().getLife() < 0)) {
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
		// TODO HERE: Create 1 player
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
			}
		} else {
			animal_01.scream();
		}
		return "";

		// scan.close(); // Ca merde quand on close => etrange !
	}

}