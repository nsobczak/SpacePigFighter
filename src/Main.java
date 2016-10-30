import java.util.Scanner;

import stuff.Defensif;

import animalPackage.Animal;

/**
 * ===== Class Main =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public class Main {

	/**
	 * playersCreation function
	 * 
	 * @param args
	 * @return nothing
	 */
	public static void playersCreation(String[] args) {
		// TODO HERE: Create 2 players

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your pseudo:");
		String pseudoEntered = scan.nextLine();

		Player player_1 = new Player(pseudoEntered);

		System.out.println("This is part 1 !!!");
	}

	/**
	 * Game part 1 function
	 * 
	 * @param args
	 * @return nothing
	 */
	public static void part_1(String[] args) {
		// TODO HERE: Part 1 of the game
		Space space = new Space();

		System.out.println("This is part 1 !!!");
	}

	/**
	 * Game part 2 function
	 * 
	 * @param args
	 * @return nothing
	 */
	public static void part_2(String[] args) {
		// TODO HERE: Part 2 of the game
		FightArea fightArea = new FightArea();

		System.out.println("This is part 2 !!!");
	}

	/**
	 * ___________________________________________________________________________________________
	 * main function
	 * 
	 * @param args
	 * @return nothing
	 */
	public static void main(String[] args) {
		// TODO Main loop
		System.out.println("Welcome in spacePigFighter");

		System.out.println("spacePigFighter is an awesome fight game");

		System.out.println("\nEntering player creation...");
		playersCreation(args);
		System.out.println("...End of player creation");

		System.out.println("\nEntering part 1 of the game...");
		part_1(args);
		System.out.println("...End of part 1");

		System.out.println("\nEntering part 2 of the game...");
		part_2(args);
		System.out.println("...End of part 2");

		System.out.println("\nThis is the end of the game");
	}

}
