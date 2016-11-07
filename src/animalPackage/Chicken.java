package animalPackage;

public class Chicken extends WithWings {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = chicken's Pseudo
	 */
	public Chicken(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = chicken's Pseudo
	 * @param 1 String = chicken's color
	 */
	public Chicken(String newPseudo, String newColor) {
		super(newPseudo, newColor);
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */

	public void attack() {
	}

	public String specialAction() {
		return null;
	}

	public void scream() {
	}

}