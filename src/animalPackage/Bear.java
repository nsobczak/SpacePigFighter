package animalPackage;

public class Bear extends WithPaws {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = bear's Pseudo
	 * @return nothing
	 */
	public Bear(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = bear's Pseudo
	 * @param 1 String = bear's color
	 * @return nothing
	 */
	public Bear(String newPseudo, String newColor) {
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