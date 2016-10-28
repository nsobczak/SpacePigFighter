package Stuff;

/**
 * Defensif class
 */
public class Defensif {

	/*
	 * ___________________________________________________________________________________________
	 * Properties
	 */
	/**
	 * Bonus on the pig's resistance value
	 */
	private Integer bonusResistance;

	/*
	 * ___________________________________________________________________________________________
	 * Constants
	 */
	/**
	 * Increases the resistance of 5
	 */
	public static final Defensif HELMET = new Defensif(5);

	/**
	 * Increases the resistance of 10
	 */
	public static final Defensif SHIELD = new Defensif(10);

	/**
	 * Doesn't increase the resistance
	 */
	public static final Defensif NONE = new Defensif(0);

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 */
	public Defensif(Integer bonusValue) {
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set the bonusResistance
	 */
	public void setBonusResistance(Integer bonusValue) {
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get the bonusResistance value
	 */
	public Integer getBonusResistance() {
		return null;
	}

}