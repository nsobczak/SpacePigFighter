import java.util.Scanner;
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
		int classEnteredInt = 0;
				
		boolean classEnteredIsValid = false;
		while (!classEnteredIsValid) {
			System.out
					.println("Choose your animal: \n1 for Bear | 2 for Chicken | 3 for Duck | 4 for Pig | 5 for Tiger");
			String classEntered = scan.nextLine();
			try {
				classEnteredInt = Integer.parseInt(classEntered);
				classEnteredIsValid = true;
			} catch (NumberFormatException e) {
				classEnteredIsValid = false;
				System.out.println("Please enter a number");
			} catch (NullPointerException e) {
				classEnteredIsValid = false;
				System.out.println("Please enter a number");
			}
		}

		System.out.println("Enter your pseudo:");
		String pseudoEntered = scan.nextLine();

		Player player_1 = new Player(classEnteredInt, pseudoEntered);

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

		// Player
		System.out.println("\nEntering player creation...");
		playersCreation(args);
		System.out.println("...End of player creation");

		// Part1
		System.out.println("\nEntering part 1 of the game...");
		part_1(args);
		System.out.println("...End of part 1");

		// Part2
		System.out.println("\nEntering part 2 of the game...");
		part_2(args);
		System.out.println("...End of part 2");

		System.out.println("\nThis is the end of the game");
	}

}
