import java.util.Scanner;

import animalPackage.Animal;
import cubeEnvironment.CubeEnvironment;
import playerPackage.Player;
import spaceObjects.PositionException;
import spaceObjects.PositionsCube;

public class Space implements ExecutionInterface {

	public CubeEnvironment cubeEnvironment_01;

	public CubeEnvironment cubeEnvironment_02;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1
	 *            Player = player_1
	 * @param 1
	 *            Player = player_2
	 */
	public Space(Player player_1, Player player_2) {
		this.cubeEnvironment_01 = new CubeEnvironment(player_1);
		this.cubeEnvironment_02 = new CubeEnvironment(player_2);
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * run()
	 * 
	 */
	public String run() {
		String result = null;
		this.cubeEnvironment_01.relocateAllUfo();
		this.cubeEnvironment_02.relocateAllUfo();
		boolean player1FoundEnnemysSpacecraft;
		player1FoundEnnemysSpacecraft = loop();
		
		//Check the result
		if (player1FoundEnnemysSpacecraft) {
			result = "Player1 has found the player2's Spacecraft !";
		}
		else{
			result = "Player2 has found the player1's Spacecraft !";
		}		
		return result;
	}

	/**
	 * loop() : main function
	 * 
	 */
	private boolean loop() {
		boolean player1FoundEnnemysSpacecraft = false;
		boolean player2FoundEnnemysSpacecraft = false;
		System.out.println("Player1's spacecraft position : " + this.cubeEnvironment_01.getSpacecraft().getLocation());
		System.out.println("Player2's spacecraft position : " + this.cubeEnvironment_02.getSpacecraft().getLocation());
		
		PositionsCube choosenPosition = PositionsCube.NONE;
		while ((!player1FoundEnnemysSpacecraft) && (!player2FoundEnnemysSpacecraft)) {
			// player01 chooses one location
			System.out.println("\n--Player 1 turn--");
			choosenPosition = this.selectLocation();
			System.out.println("Player1 selects the position : " + choosenPosition);
			
			// check if player1 found ennemy's spacecraft
			player1FoundEnnemysSpacecraft = (this.cubeEnvironment_02.getSpacecraft().getLocation() == choosenPosition);
			if (player1FoundEnnemysSpacecraft) {
				break;
			}
			
			// player02 chooses one location
			System.out.println("\n--Player 2 turn--");
			choosenPosition = this.selectLocation();
			System.out.println("Player2 selects the position : " + choosenPosition);
			
			// check if player1 found ennemy's spacecraft
			player2FoundEnnemysSpacecraft = (this.cubeEnvironment_01.getSpacecraft().getLocation() == choosenPosition);
			
		}
		return player1FoundEnnemysSpacecraft;
	}

	/**
	 * selectAttack function
	 */
	private PositionsCube selectLocation() {
		// TODO HERE: Create 1 player
		Scanner scan = new Scanner(System.in);
		int selectedLocation = -1;
		PositionsCube selectedPosition = PositionsCube.NONE;
		boolean locationSelectedAvailable = false;

		while (!locationSelectedAvailable) {
			System.out
					.println("Choose your action: \n"
							+ "0 = position OOO \t| 1 = position OOI\n"
							+ "2 = position OIO \t| 3 = position IOO\n"
							+ "4 = position OII \t| 5 = position IOI\n"
							+ "6 = position IIO \t| 7 = position III\n");
			String selectedAction = scan.nextLine();
			try {
				selectedLocation = Integer.parseInt(selectedAction);
				switch (selectedLocation){
					case 0 : selectedPosition = PositionsCube.OOO;
					locationSelectedAvailable = true;
					break;
					case 1 : selectedPosition = PositionsCube.OOI;
					locationSelectedAvailable = true;
					break;
					case 2 : selectedPosition = PositionsCube.OIO;
					locationSelectedAvailable = true;
					break;
					case 3 : selectedPosition = PositionsCube.IOO;
					locationSelectedAvailable = true;
					break;
					case 4 : selectedPosition = PositionsCube.OII;
					locationSelectedAvailable = true;
					break;
					case 5 : selectedPosition = PositionsCube.IOI;
					locationSelectedAvailable = true;
					break;
					case 6 : selectedPosition = PositionsCube.IIO;
					locationSelectedAvailable = true;
					break;
					case 7 : selectedPosition = PositionsCube.III;
					locationSelectedAvailable = true;
					break;
					default : System.out.println("Please enter an integer between 0 and 7");
					locationSelectedAvailable = false;
				} 
			} catch (NumberFormatException e) {
				System.out.println("Please enter an integer between 0 and 7");
			} catch (NullPointerException e) {
				System.out.println("Please enter an integer between 0 and 7");
			}
		}
		return selectedPosition;

		// scan.close(); // Ca merde quand on close => etrange !
	}
}