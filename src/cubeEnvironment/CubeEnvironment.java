package cubeEnvironment;

import spaceObjects.*;
import playerPackage.Player;

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
	 * @param 1
	 *            Player = playerI
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
	 * @param 1
	 *            Spacecraft = newSpacecraft
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
	public void relocateAllUfo(){
		
	}

}