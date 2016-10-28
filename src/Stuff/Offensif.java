package Stuff;

/**
 * Offensif class
 */
public class Offensif {

	/*
	 * ___________________________________________________________________________________________
	 * Properties
	 */
	/**
	 * Bonus on the pig's force value
	 */
	private Integer bonusForce;

	/*
	 * ___________________________________________________________________________________________
	 * Constants
	 */
	/**
	 * Increases the force of 5
	 */
	public static final Offensif SWORD = new Offensif(5);

	/**
	 * Increases the force of 10
	 */
	public static final Offensif AXE = new Offensif(10);

	/**
	 * Doesn't increase the resistance
	 */
	public static final Offensif NONE = new Offensif(0);

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 */
	public Offensif(Integer bonusValue) {
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set the bonusForce
	 */
	public void setBonusForce(Integer bonusValue) {
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get the bonusForce value
	 */
	public Integer getBonusForce() {
		return null;
	}

}