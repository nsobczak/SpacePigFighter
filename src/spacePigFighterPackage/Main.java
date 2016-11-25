package spacePigFighterPackage;

import java.util.Scanner;
import playerPackage.Player;
import fileManagementPackage.*;

/**
 * ===== Class Main =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public class Main {

	/**
	 * playerCreation function
	 */
	public static Player playerCreation() {
		// TODO HERE: Create 1 player
		Scanner scan = new Scanner(System.in);
		int classEnteredInt = 0;
		boolean classEnteredIsValid = false;
		String pseudoEntered = null;
		boolean pseudoEnteredIsValid = false;

		while (!classEnteredIsValid) {
			System.out
					.println("Choose your animal: \n1 for Bear | 2 for Chicken | 3 for Duck | 4 for Pig | 5 for Tiger");
			String classEntered = scan.nextLine();
			try {
				classEnteredInt = Integer.parseInt(classEntered);
				if ((classEnteredInt >= 1) && (classEnteredInt <= 5)) {
					classEnteredIsValid = true;
				} else {
					System.out.println("Please enter a number between 1 and 5");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number");
			} catch (NullPointerException e) {
				System.out.println("Please enter a number");
			}
		}

		while (!pseudoEnteredIsValid) {
			System.out.println("Enter your pseudo:");
			pseudoEntered = scan.nextLine();
			if (!pseudoEntered.isEmpty()) {
				pseudoEnteredIsValid = true;
			}
		}

		System.out.println("Enter your animal color:");
		String animalColor = scan.nextLine();

		System.out.println("Enter your spacecraft color:");
		String spacecraftColor = scan.nextLine();

		// scan.close(); // Ca merde quand on close => etrange !
		Player returnedPlayer = new Player(classEnteredInt, pseudoEntered,
				animalColor, spacecraftColor);
		return returnedPlayer;
	}

	/**
	 * Game part 1 function
	 * 
	 * @param 1 Player = player_1
	 * @param 1 Player = player_2
	 */
	public static String part_1(Player player_1, Player player_2) {
		// TODO HERE: Part 1 of the game
		System.out.println("This is part 1 !!!");
		Space space = new Space(player_1, player_2);
		String result = space.run();
		System.out.println(result);
		return result;
	}

	/**
	 * Game part 2 function
	 * 
	 * @param 1 Player = player_1
	 * @param 1 Player = player_2
	 */
	public static String part_2(Player player_1, Player player_2) {
		// TODO HERE: Part 2 of the game
		System.out.println("This is part 2 !!!");
		FightArea fightArea = new FightArea(player_1, player_2);
		String result = fightArea.run();
		System.out.println(result);
		return result;
	}

	/**
	 * ___________________________________________________________________________________________
	 * main function
	 * 
	 * @param 1 String[] = args
	 */
	public static void main(String[] args) {
		// TODO Main loop
		System.out.println("Welcome in spacePigFighter");
		System.out.println("spacePigFighter is an awesome fight game");

		// Players
		System.out.println("\nEntering player creation...");
		System.out.println("=>Player 1");
		Player player_1 = playerCreation();
		System.out.println("\n=>Player 2");
		Player player_2 = playerCreation();
		System.out.println("...End of player creation");

		// Part1
		System.out.println("\nEntering part 1 of the game...");
		part_1(player_1, player_2);
		System.out.println("...End of part 1");

		// Part2
		System.out.println("\nEntering part 2 of the game...");
		String fightResult = part_2(player_1, player_2);
		System.out.println("...End of part 2");

		System.out.println("\nThis is the end of the game");

		// logger
		String story = FileManagement.writeStory(player_1, player_2,
				fightResult);
		FileManagement.createFile("SpacePigFighter.log");
		FileManagement.writeFile("SpacePigFighter.log", story);
	}

}
