package spaceObjects;

/**
 * ===== Class Ufo =====
 * 
 * useful to have position in the cube
 * 
 * @author Vincent Reynaert
 * @version 1.02, 10/2016
 */
public abstract class Ufo {

	/**
	 * Position of one instance of the Position class. Set to (0,0,0) by
	 * default.
	 */
	private PositionsCube location;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor. Set location by default to (0,0,0)
	 */
	public Ufo() {
		this.location = PositionsCube.OOO;
	}

	/**
	 * Constructor. with selected position
	 * 
	 * @param 1
	 *            PositionsCube = position
	 */
	public Ufo(PositionsCube position) {
		this.location = position;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get the Ufo location
	 * 
	 * @return 1 Positions = location
	 */
	public PositionsCube getLocation() {
		return this.location;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set the Ufo location
	 * 
	 * @param 1
	 *            PostionsCube = position
	 */
	public void setLocation(PositionsCube position) {
		this.location = position;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * Change the location of the Ufo on the CubeEnvironment
	 * 
	 * @param 1
	 *            PositionsCube = position
	 */
	public void moveUfo(PositionsCube position) {
		this.setLocation(position);
	}

}