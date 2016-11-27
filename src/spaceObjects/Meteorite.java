package spaceObjects;

/**
 * ===== Class Meteorite =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.02, 11/2016
 */
public class Meteorite extends Ufo {

	private MeteoriteSize size;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor where size is necessary selected by the player
	 * 
	 * @param 1 MeteoriteSize = meteoriteSize
	 */
	public Meteorite(MeteoriteSize meteoriteSize) {
		super();
		this.size = meteoriteSize;
	}

	/**
	 * Constructor with selected position and size
	 * 
	 * @param 1 PositionsCube = position
	 * @param 1 MeteoriteSize = meteoriteSize
	 */
	public Meteorite(PositionsCube position, MeteoriteSize meteoriteSize) {
		super(position);
		this.size = meteoriteSize;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get the meteorite size
	 * 
	 * @return 1 MeteoriteSize = size
	 */
	public MeteoriteSize getSize() {
		return this.size;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set a new size to the meteorite
	 * 
	 * @param 1 MeteoriteSize = newSize
	 */
	public void setSize(MeteoriteSize newSize) {
		this.size = newSize;
	}

}