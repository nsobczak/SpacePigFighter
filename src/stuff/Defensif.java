package stuff;

/**
 * ===== Class Defensif =====
 * 
 * @author Nicolas Sobczak
 * @version 1.02, 11/2016
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
	 * 
	 * @param int newBonusValue
	 */
	public Defensif(Integer newBonusValue) {
		this.bonusResistance = newBonusValue;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set the bonusResistance
	 * 
	 * @param int newBonusValue
	 */
	public void setBonusResistance(Integer newBonusValue) {
		this.bonusResistance = newBonusValue;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get the bonusResistance value
	 * 
	 * @return int bonusResistance
	 */
	public Integer getBonusResistance() {
		return this.bonusResistance;
	}

}