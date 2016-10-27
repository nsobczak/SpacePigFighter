package Animal;

import Stuff.Defensif;
import Stuff.Offensif;

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

	private String color;

	private Integer force;

	private Integer life;

	private Integer resistance;

	private Defensif stuffDefensif;

	private Offensif stuffOffensif;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @return nothing
	 */
	public Animal(String newPseudo) {
		this.PSEUDO = newPseudo;
		this.color = "pink";
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get animal's color
	 * 
	 * @param nothing
	 * @return 1 String = animal's color value
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Get animal's force
	 * 
	 * @param nothing
	 * @return 1 int = animal's force value
	 */
	public Integer getForce() {
		return this.force;
	}

	/**
	 * Get animal's life
	 * 
	 * @param nothing
	 * @return 1 int = animal's life value
	 */
	public Integer getLife() {
		return this.life;
	}

	/**
	 * Get animal's pseudo
	 * 
	 * @param nothing
	 * @return 1 String = animal's pseudo value
	 */
	public String getPSEUDO() {
		return this.PSEUDO;
	}

	/**
	 * Get animal's resistance
	 * 
	 * @param nothing
	 * @return 1 int = animal's resistance value
	 */
	public Integer getResistance() {
		return this.resistance;
	}

	/**
	 * Get animal's defensif stuff
	 * 
	 * @param nothing
	 * @return 1 Defensif = animal's defensif stuff
	 */
	public Defensif getStuffDefensif() {
		return this.stuffDefensif;
	}

	/**
	 * Get animal's offensif stuff
	 * 
	 * @param nothing
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
	 * @return nothing
	 */
	public void setColor(String colorValue) {
		this.color = colorValue;
	}

	/**
	 * Set animal's force
	 * 
	 * @param 1 int = animal's force value
	 * @return nothing
	 */
	public void setForce(Integer forceValue) {
		this.force = forceValue;
	}

	/**
	 * Set animal's resistance
	 * 
	 * @param 1 int = animal's resistance value
	 * @return nothing
	 */
	public void setResistance(Integer resistanceValue) {
		this.resistance = resistanceValue;
	}

	/**
	 * Set animal's life
	 * 
	 * @param 1 int = animal's life value
	 * @return nothing
	 */
	public void setLife(Integer lifeValue) {
		this.life = lifeValue;
	}

	/**
	 * Set animal's defensif stuff
	 * 
	 * @param 1 Defensif = animal's defensif stuff
	 * @return nothing
	 */
	public void setStuffDefensif(Defensif newDefensif) {
		this.stuffDefensif = newDefensif;
	}

	/**
	 * Set animal's offensif stuff
	 * 
	 * @param 1 Offensif = animal's offensif stuff
	 * @return nothing
	 */
	public void setStuffOffensif(Offensif newOffensif) {
		this.stuffOffensif = newOffensif;
	}

}