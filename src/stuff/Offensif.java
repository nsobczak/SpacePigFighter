package stuff;

/**
 * ===== Class Offensif =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.02, 11/2016
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
	 * 
	 * @param int newBonusValue
	 */
	public Offensif(Integer newBonusValue) {
		this.bonusForce = newBonusValue;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set the bonusForce
	 * 
	 * @param int newBonusValue
	 */
	public void setBonusForce(Integer newBonusValue) {
		this.bonusForce = newBonusValue;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get the bonusForce value
	 * 
	 * @return int bonusForce
	 */
	public Integer getBonusForce() {
		return this.bonusForce;
	}

}