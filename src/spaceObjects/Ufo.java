package spaceObjects;

/**
 * ===== Class Ufo =====
 * 
 * useful to have position in the cube
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
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
	 * @param 1 PositionsCube = position
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
	 * @param 1 PostionsCube = position
	 */
	public void setLocation(PositionsCube position) {
		this.location = position;
	}

	/**
	 * Set the Ufo location
	 * 
	 * @param 1 int = position
	 */
	public void setLocation(int position) throws PositionException {
		switch (position) {
		case 0:
			this.location = PositionsCube.OOO;
			break;
		case 1:
			this.location = PositionsCube.OOI;
			break;
		case 2:
			this.location = PositionsCube.OIO;
			break;
		case 3:
			this.location = PositionsCube.IOO;
			break;
		case 4:
			this.location = PositionsCube.OII;
			break;
		case 5:
			this.location = PositionsCube.IOI;
			break;
		case 6:
			this.location = PositionsCube.IIO;
			break;
		case 7:
			this.location = PositionsCube.III;
			break;
		default:
			throw new PositionException();
		}
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */

}