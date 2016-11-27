package fileManagementPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import playerPackage.Player;

/**
 * ===== Class FileManagement =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.03, 11/2016
 */
public class FileManagement {

	/**
	 * createFile function that create a file
	 * 
	 * @param 1 String fileName
	 */
	public static void createFile(String fileName) {
		// creation du fichier
		try {
			File loggerFile = new File(fileName);
			if (loggerFile.createNewFile()) {
				System.out.println("File has been created");
			} else {
				System.out.println("Error, the file isn’t created");
			}
		} catch (IOException exception) {
			System.out.println("Error when trying to create file : "
					+ exception.getMessage());
		}
	}

	/**
	 * writeFile function
	 * 
	 * @param 1 String fileName
	 * @param 1 String stringToWrite
	 */
	public static void writeFile(String fileName, String stringToWrite) {

		try {
			FileWriter file = new FileWriter(fileName);
			BufferedWriter buffer = new BufferedWriter(file);

			buffer.write(stringToWrite);
			buffer.newLine();
			buffer.close();

			file.close();

		} catch (IOException exception) {
			System.out.println("Error writing a file : "
					+ exception.getMessage());
		}
	}

	/**
	 * writeStory function which writes the fight story
	 * 
	 * @param 2 Player player_1 and player_2
	 * @param 1 String fightResult : the result of the fightArea fight
	 */
	public static String writeStory(Player player_1, Player player_2,
			String fightResult) {
		String story = "Welcome in spacePigFighter\n\n";
		story += "===Player01===\nanimal: " + player_1.getAnimal()
				+ "\npseudo: " + player_1.getAnimal().getPSEUDO()
				+ "\nanimal color: " + player_1.getAnimal().getColor()
				+ "\nspacecraft color: " + player_1.getSpacecraft().getColor();
		story += "\n\n===Player02===\nanimal: " + player_2.getAnimal()
				+ "\npseudo: " + player_2.getAnimal().getPSEUDO()
				+ "\nanimal color: " + player_2.getAnimal().getColor()
				+ "\nspacecraft color: " + player_2.getSpacecraft().getColor();
		story += "\n\n==>Fight result : " + fightResult;
		return story;
	}

}
