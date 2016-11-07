package animalPackage;

import stuff.Defensif;
import stuff.Offensif;

/**
 * ===== Class Animal =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public abstract class Animal {

	/*
	 * ___________________________________________________________________________________________
	 * Properties
	 */
	private final String PSEUDO;

	protected String color;
	
	protected Integer life;

	protected Integer force;

	protected Integer resistance;

	protected Defensif stuffDefensif;

	protected Offensif stuffOffensif;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 */
	public Animal(String newPseudo) {
		this.PSEUDO = newPseudo;
		this.color = "pink";
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
	 */
	public Animal(String newPseudo, String newColor) {
		this.PSEUDO = newPseudo;
		this.color = newColor;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get animal's color
	 * 
	 * @return 1 String = animal's color value
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Get animal's force
	 * 
	 * @return 1 int = animal's force value
	 */
	public Integer getForce() {
		return this.force;
	}

	/**
	 * Get animal's life
	 * 
	 * @return 1 int = animal's life value
	 */
	public Integer getLife() {
		return this.life;
	}

	/**
	 * Get animal's pseudo
	 * 
	 * @return 1 String = animal's pseudo value
	 */
	public String getPSEUDO() {
		return this.PSEUDO;
	}

	/**
	 * Get animal's resistance
	 * 
	 * @return 1 int = animal's resistance value
	 */
	public Integer getResistance() {
		return this.resistance;
	}

	/**
	 * Get animal's defensif stuff
	 * 
	 * @return 1 Defensif = animal's defensif stuff
	 */
	public Defensif getStuffDefensif() {
		return this.stuffDefensif;
	}

	/**
	 * Get animal's offensif stuff
	 * 
	 * @return 1 Offensif = animal's offensif stuff
	 */
	public Offensif getStuffOffensif() {
		return this.stuffOffensif;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set animal's color
	 * 
	 * @param 1 String = animal's color value
	 */
	public void setColor(String colorValue) {
		this.color = colorValue;
	}

	/**
	 * Set animal's force
	 * 
	 * @param 1 int = animal's force value
	 */
	public void setForce(Integer forceValue) {
		this.force = forceValue;
	}

	/**
	 * Set animal's resistance
	 * 
	 * @param 1 int = animal's resistance value
	 */
	public void setResistance(Integer resistanceValue) {
		this.resistance = resistanceValue;
	}

	/**
	 * Set animal's life
	 * 
	 * @param 1 int = animal's life value
	 */
	public void setLife(Integer lifeValue) {
		this.life = lifeValue;
	}

	/**
	 * Set animal's defensif stuff
	 * 
	 * @param 1 Defensif = animal's defensif stuff
	 */
	public void setStuffDefensif(Defensif newDefensif) {
		this.stuffDefensif = newDefensif;
	}

	/**
	 * Set animal's offensif stuff
	 * 
	 * @param 1 Offensif = animal's offensif stuff
	 */
	public void setStuffOffensif(Offensif newOffensif) {
		this.stuffOffensif = newOffensif;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Function
	 */
	/**
	 * Decrease animal's life
	 * 
	 * @param 1 Integer = damages
	 */
	public void decreaseLife(Integer damages) {
		this.setLife(this.life - damages);
	}

}