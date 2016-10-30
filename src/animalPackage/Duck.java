package animalPackage;

public class Duck extends WithWings {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = duck's Pseudo
	 * @return nothing
	 */
	public Duck(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = duck's Pseudo
	 * @param 1 String = duck's color
	 * @return nothing
	 */
	public Duck(String newPseudo, String newColor) {
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