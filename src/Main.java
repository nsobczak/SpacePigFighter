//import java.io.IOException;
import java.util.Scanner;
import java.io.File;
//import java.io.FileOutputStream;

/**
 * ===== Class Main =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public class Main {

	/**
	 * playerCreation function
	 * 
	 * @param 1 String fileName
	 * @param 1 String stringToWrite
	 * @return nothing
	 */
	public static void loggingFile(File fileName, String stringToWrite) {
		try {
			// BufferedWriter bw = new BufferedWriter(new
			// FileWriter("repertoire.txt"));
			// PrintWriter pWriter = new PrintWriter(bw);
			// pWriter.print(nom+":"+numero);
			// pWriter.close() ;
			//
			// fw.close();
		} catch (NullPointerException exception) {
			System.out.println("Erreur lors de la lecture : "
					+ exception.getMessage());
		}
	}

	/**
	 * playerCreation function
	 * 
	 * @param args
	 * @return nothing
	 */
	public static Player playerCreation() {
		// TODO HERE: Create 1 player
		Scanner scan = new Scanner(System.in);
		int classEnteredInt = 0;
		boolean classEnteredIsValid = false;

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

		System.out.println("Enter your pseudo:");
		String pseudoEntered = scan.nextLine();
		
		System.out.println("Enter your animal color:");
		String animalColor = scan.nextLine();
		
		System.out.println("Enter your spacecraft color:");
		String spacecraftColor = scan.nextLine();
		
		// scan.close(); // Ca merde quand on close => etrange !
		Player returnedPlayer = new Player(classEnteredInt, pseudoEntered, animalColor, spacecraftColor);
		return returnedPlayer;
	}

	/**
	 * Game part 1 function
	 * 
	 * @param 1 Player player_1
	 * @param 1 Player player_2
	 * @return nothing
	 */
	public static void part_1(Player player_1, Player player_2) {
		// TODO HERE: Part 1 of the game
		Space space = new Space(player_1, player_2);

		System.out.println("This is part 1 !!!");
	}

	/**
	 * Game part 2 function
	 * 
	 * @param 1 Player player_1
	 * @param 1 Player player_2
	 * @return nothing
	 */
	public static void part_2(Player player_1, Player player_2) {
		// TODO HERE: Part 2 of the game
		FightArea fightArea = new FightArea(player_1, player_2);

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

		// Initialisation
		// File storyFile = new File("storyFile");
		// loggingFile(storyFile, "Welcome in spacePigFighter");

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
		part_2(player_1, player_2);
		System.out.println("...End of part 2");

		System.out.println("\nThis is the end of the game");
	}

}
