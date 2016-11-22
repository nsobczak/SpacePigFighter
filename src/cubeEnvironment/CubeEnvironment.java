package cubeEnvironment;

import spaceObjects.*;
import playerPackage.Player;
import java.util.Random;

/**
 * ===== Class CubeEnvironment =====
 * 
 * @author Vincent Reynaert
 * @version 1.03, 11/2016
 */
public class CubeEnvironment {

	/**
	 * Pig's spacecraft
	 */
	private Spacecraft spacecraft;

	private Meteorite meteoriteSmall;

	private Meteorite meteoriteMedium;

	private Meteorite meteoriteBig;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 */
	public CubeEnvironment() {
	}

	/**
	 * Constuctor
	 * 
	 * @param 1 Player = playerI
	 */
	public CubeEnvironment(Player playerI) {
		this.spacecraft = playerI.getSpacecraft();
		this.meteoriteSmall = new Meteorite(MeteoriteSize.SMALL);
		this.meteoriteMedium = new Meteorite(MeteoriteSize.MEDIUM);
		this.meteoriteBig = new Meteorite(MeteoriteSize.BIG);
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get CubeEnvironment spacecraft
	 * 
	 * @return 1 Spacecraft = spacecraft
	 */
	public Spacecraft getSpacecraft() {
		return this.spacecraft;
	}

	/**
	 * Get CubeEnvironment meteoriteSmall
	 * 
	 * @return 1 Meteorite = meteoriteSmall
	 */
	public Meteorite getMeteoriteSmall() {
		return this.meteoriteSmall;
	}

	/**
	 * Get CubeEnvironment meteoriteMedium
	 * 
	 * @return 1 Meteorite = meteoriteMedium
	 */
	public Meteorite getMeteoriteMedium() {
		return this.meteoriteMedium;
	}

	/**
	 * Get CubeEnvironment meteoriteBig
	 * 
	 * @return 1 Meteorite = meteoriteBig
	 */
	public Meteorite getMeteoriteBig() {
		return this.meteoriteBig;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set CubeEnvironment spacecraft
	 * 
	 * @param 1 Spacecraft = newSpacecraft
	 */
	public void setSpacecraft(Spacecraft newSpacecraft) {
		this.spacecraft = newSpacecraft;
	}

	/**
	 * Set CubeEnvironment meteoriteSmall
	 * 
	 * @param 1 Meteorite = newMeteorite
	 */
	public void setMeteoriteSmall(Meteorite newMeteorite) {
		this.meteoriteSmall = newMeteorite;
	}

	/**
	 * Set CubeEnvironment meteoriteMedium
	 * 
	 * @param 1 Meteorite = newMeteorite
	 */
	public void setMeteoriteMedium(Meteorite newMeteorite) {
		this.meteoriteMedium = newMeteorite;
	}

	/**
	 * Set CubeEnvironment meteoriteBig
	 * 
	 * @param 1 Meteorite = newMeteorite
	 */
	public void setMeteoriteBig(Meteorite newMeteorite) {
		this.meteoriteBig = newMeteorite;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	public PositionsCube intToPosition(int position) throws PositionException {
		switch (position) {
		case 0:
			return PositionsCube.OOO;
		case 1:
			return PositionsCube.OOI;
		case 2:
			return PositionsCube.OIO;
		case 3:
			return PositionsCube.IOO;
		case 4:
			return PositionsCube.OII;
		case 5:
			return PositionsCube.IOI;
		case 6:
			return PositionsCube.IIO;
		case 7:
			return PositionsCube.III;
		default:
			throw new PositionException();
		}
	}

	public void relocateAllUfo() {
		Random rand = new Random();
		int position;
		int i;
		PositionsCube[] positions = { PositionsCube.NONE, PositionsCube.NONE,
				PositionsCube.NONE, PositionsCube.NONE };
		boolean positionAvailable;

		positionAvailable = false;
		for (i = 0; i <= 3; i++) {
			positionAvailable = false;
			while (!positionAvailable) {
				position = rand.nextInt(8);
				try {
					positions[i] = intToPosition(position);
					switch (i) {
					case 0:
						positionAvailable = true;
						break;
					case 1:
						positionAvailable = ((positions[1] != positions[0]) && (positions[1] != PositionsCube.NONE));
						break;
					case 2:
						positionAvailable = ((positions[2] != positions[1])
								&& (positions[2] != positions[0]) && (positions[2] != PositionsCube.NONE));
						break;
					case 3:
						positionAvailable = ((positions[3] != positions[2])
								&& (positions[3] != positions[1])
								&& (positions[3] != positions[0]) && (positions[3] != PositionsCube.NONE));
						break;
					default:
						positionAvailable = false;
					}
				} catch (PositionException e) {
					positionAvailable = false;
				}
			}
		}

		this.spacecraft.setLocation(positions[0]);
		this.meteoriteSmall.setLocation(positions[1]);
		this.meteoriteMedium.setLocation(positions[2]);
		this.meteoriteBig.setLocation(positions[3]);

	}

}