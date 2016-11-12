import java.util.Scanner;

import animalPackage.Animal;
import playerPackage.Player;

/**
 * ===== Class FightArea =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 11/2016
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
		this.animal_player_01 = player_01.animal;
		this.animal_player_02 = player_02.animal;
	}
	
	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Getter
	 * 
	 * @return animal_player_01
	 */
	public Animal getAnimalPlayer01() {
		return this.animal_player_01;
	}
	
	/**
	 * Getter
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
	 * Setter
	 * 
	 * @param Animal new_animal_player_01
	 */
	public void setAnimalPlayer01(Animal new_animal_player_01) {
		this.animal_player_01 = new_animal_player_01;
	}
	
	/**
	 * Setter
	 * 
	 * @param Animal new_animal_player_02
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
		
		loop();
		//Check the result
		if ((this.getAnimalPlayer01().getLife() < 0)
				&& (this.getAnimalPlayer02().getLife() < 0)) {
			result = "both animal are dead | draw";
		}else{
			if (this.getAnimalPlayer01().getLife() < 0){
				result = "player 1 is dead | player 2 is the winner";
			}else{
				result = "player 2 is dead | player 1 is the winner";
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
			// player01 chooses its action
			System.out.println("\n--Player 1 turn--");
			this.selectAttack(this.getAnimalPlayer01(), this.getAnimalPlayer02());
			// player02 chooses its action
			System.out.println("\n--Player 2 turn--");
			this.selectAttack(this.getAnimalPlayer02(), this.getAnimalPlayer01());
			// check if one animal is dead
			if ((this.getAnimalPlayer01().getLife() < 0)
					|| (this.getAnimalPlayer02().getLife() < 0)) {
				deadAnimalFound = true;
			}
		}
	}

	/**
	 * selectAttack function
	 */
	private void selectAttack(Animal animal_01, Animal animal_02) {
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
		} else if (selectedAttack == 2) {
			animal_01.specialAction(animal_02);
		} else {
			animal_01.scream();
		}

		// scan.close(); // Ca merde quand on close => etrange !
	}

}