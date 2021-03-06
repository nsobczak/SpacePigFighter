package spacePigFighterPackage;

import java.util.Scanner;
import animalPackage.Animal;
import cubeEnvironment.CubeEnvironment;
import playerPackage.Player;
import spaceObjects.MeteoriteSize;
import spaceObjects.PositionException;
import spaceObjects.PositionsCube;

/**
 * ===== Class Space =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.03, 11/2016
 */
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
	 * @param 1 Player = player_1
	 * @param 1 Player = player_2
	 */
	public Space(Player player_1, Player player_2) {
		this.cubeEnvironment_01 = new CubeEnvironment(player_1);
		this.cubeEnvironment_02 = new CubeEnvironment(player_2);
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get Space cubeEnvironment_01
	 * 
	 * @return CubeEnvironment cubeEnvironment_01
	 */
	public CubeEnvironment getCubeEnvironment01() {
		return this.cubeEnvironment_01;
	}

	/**
	 * Get Space cubeEnvironment_02
	 * 
	 * @return CubeEnvironment cubeEnvironment_02
	 */
	public CubeEnvironment getCubeEnvironment02() {
		return this.cubeEnvironment_02;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set Space cubeEnvironment_01
	 * 
	 * @param CubeEnvironment
	 *            cubeEnvironment_01
	 */
	public void setCubeEnvironment01(CubeEnvironment new_cubeEnvironment_01) {
		this.cubeEnvironment_01 = new_cubeEnvironment_01;
	}

	/**
	 * Set Space cubeEnvironment_02
	 * 
	 * @param CubeEnvironment
	 *            cubeEnvironment_02
	 */
	public void ssetCubeEnvironment02(CubeEnvironment new_cubeEnvironment_02) {
		this.cubeEnvironment_02 = new_cubeEnvironment_02;
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

		// Check the result
		if (player1FoundEnnemysSpacecraft) {
			result = "Player1 has found the player2's Spacecraft !";
		} else {
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

		System.out
				.println("Player1's animal life : "
						+ this.cubeEnvironment_01.getSpacecraft().getAnimal()
								.getLife());
		System.out
				.println("Player2's animal life : "
						+ this.cubeEnvironment_02.getSpacecraft().getAnimal()
								.getLife());
		/*
		 * System.out.println("Player1's spacecraft position : " +
		 * this.cubeEnvironment_01.getSpacecraft().getLocation());
		 * System.out.println("Player2's spacecraft position : " +
		 * this.cubeEnvironment_02.getSpacecraft().getLocation());
		 * System.out.println("Player1's meteoriteSmall position : " +
		 * this.cubeEnvironment_01.getMeteoriteSmall().getLocation());
		 * System.out.println("Player2's meteoriteSmall position : " +
		 * this.cubeEnvironment_02.getMeteoriteSmall().getLocation());
		 * System.out.println("Player1's meteoriteMedium position : " +
		 * this.cubeEnvironment_01.getMeteoriteMedium().getLocation());
		 * System.out.println("Player2's meteoriteMedium position : " +
		 * this.cubeEnvironment_02.getMeteoriteMedium().getLocation());
		 * System.out.println("Player1's meteoriteBig position : " +
		 * this.cubeEnvironment_01.getMeteoriteBig().getLocation());
		 * System.out.println("Player2's meteoriteBig position : " +
		 * this.cubeEnvironment_02.getMeteoriteBig().getLocation());
		 */
		PositionsCube choosenPosition = PositionsCube.NONE;
		while ((!player1FoundEnnemysSpacecraft)
				&& (!player2FoundEnnemysSpacecraft)) {
			// player01 chooses one location
			System.out.println("\n-- "
					+ this.cubeEnvironment_01.getSpacecraft().getAnimal()
							.getPSEUDO() + " --");
			choosenPosition = this.selectLocation();
			System.out.println("Player1 selects the position : "
					+ choosenPosition);

			// check if player1 found ennemy's spacecraft
			player1FoundEnnemysSpacecraft = (this.cubeEnvironment_02
					.getSpacecraft().getLocation() == choosenPosition);
			if (player1FoundEnnemysSpacecraft) {
				break;
			}

			// check if player1 collides with a meteorite
			if (this.cubeEnvironment_02.getMeteoriteSmall().getLocation() == choosenPosition) {
				System.out.println("Player1 selects the small"
						+ " meteorite position");
				this.cubeEnvironment_01.getSpacecraft().beDamagedBy(
						MeteoriteSize.SMALL);
			} else {
				if (this.cubeEnvironment_02.getMeteoriteMedium().getLocation() == choosenPosition) {
					System.out.println("Player1 selects the medium"
							+ " meteorite position");
					this.cubeEnvironment_01.getSpacecraft().beDamagedBy(
							MeteoriteSize.MEDIUM);
				} else {
					if (this.cubeEnvironment_02.getMeteoriteBig().getLocation() == choosenPosition) {
						System.out.println("Player1 selects the big"
								+ " meteorite position");
						this.cubeEnvironment_01.getSpacecraft().beDamagedBy(
								MeteoriteSize.BIG);
					}
				}
			}
			System.out.println(this.cubeEnvironment_01.getSpacecraft()
					.getAnimal().getPSEUDO()
					+ "'s animal life : "
					+ this.cubeEnvironment_01.getSpacecraft().getAnimal()
							.getLife());

			// player02 chooses one location
			System.out.println("\n-- "
					+ this.cubeEnvironment_02.getSpacecraft().getAnimal()
							.getPSEUDO() + " --");
			choosenPosition = this.selectLocation();
			System.out.println(this.cubeEnvironment_02.getSpacecraft()
					.getAnimal().getPSEUDO()
					+ " selects the position : " + choosenPosition);

			// check if player1 found ennemy's spacecraft
			player2FoundEnnemysSpacecraft = (this.cubeEnvironment_01
					.getSpacecraft().getLocation() == choosenPosition);

			// check if player2 collides with a meteorite
			if (this.cubeEnvironment_01.getMeteoriteSmall().getLocation() == choosenPosition) {
				System.out.println("Player2 selects the small"
						+ " meteorite position");
				this.cubeEnvironment_02.getSpacecraft().beDamagedBy(
						MeteoriteSize.SMALL);
			} else {
				if (this.cubeEnvironment_01.getMeteoriteMedium().getLocation() == choosenPosition) {
					System.out.println("Player2 selects the medium"
							+ " meteorite position");
					this.cubeEnvironment_02.getSpacecraft().beDamagedBy(
							MeteoriteSize.MEDIUM);
				} else {
					if (this.cubeEnvironment_01.getMeteoriteBig().getLocation() == choosenPosition) {
						System.out.println("Player2 selects the big"
								+ " meteorite position");
						this.cubeEnvironment_02.getSpacecraft().beDamagedBy(
								MeteoriteSize.BIG);
					}
				}
			}
			System.out.println(this.cubeEnvironment_02.getSpacecraft()
					.getAnimal().getPSEUDO()
					+ "'s animal life : "
					+ this.cubeEnvironment_02.getSpacecraft().getAnimal()
							.getLife());

		}
		return player1FoundEnnemysSpacecraft;
	}

	/**
	 * selectAttack function
	 */
	private PositionsCube selectLocation() {
		// Create 1 player
		Scanner scan = new Scanner(System.in);
		int selectedLocation = -1;
		PositionsCube selectedPosition = PositionsCube.NONE;
		boolean locationSelectedAvailable = false;

		while (!locationSelectedAvailable) {
			System.out.println("Guess ennemy's spacecraft location: \n"
					+ "0 = position OOO \t| 1 = position OOI\n"
					+ "2 = position OIO \t| 3 = position IOO\n"
					+ "4 = position OII \t| 5 = position IOI\n"
					+ "6 = position IIO \t| 7 = position III\n");
			String selectedAction = scan.nextLine();
			try {
				selectedLocation = Integer.parseInt(selectedAction);
				switch (selectedLocation) {
				case 0:
					selectedPosition = PositionsCube.OOO;
					locationSelectedAvailable = true;
					break;
				case 1:
					selectedPosition = PositionsCube.OOI;
					locationSelectedAvailable = true;
					break;
				case 2:
					selectedPosition = PositionsCube.OIO;
					locationSelectedAvailable = true;
					break;
				case 3:
					selectedPosition = PositionsCube.IOO;
					locationSelectedAvailable = true;
					break;
				case 4:
					selectedPosition = PositionsCube.OII;
					locationSelectedAvailable = true;
					break;
				case 5:
					selectedPosition = PositionsCube.IOI;
					locationSelectedAvailable = true;
					break;
				case 6:
					selectedPosition = PositionsCube.IIO;
					locationSelectedAvailable = true;
					break;
				case 7:
					selectedPosition = PositionsCube.III;
					locationSelectedAvailable = true;
					break;
				default:
					System.out
							.println("Please enter an integer between 0 and 7");
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