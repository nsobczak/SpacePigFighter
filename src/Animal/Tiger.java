package Animal;

public class Tiger extends WithPaws {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = tiger's Pseudo
	 * @return nothing
	 */
	public Tiger(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = tiger's Pseudo
	 * @param 1 String = tiger's color
	 * @return nothing
	 */
	public Tiger(String newPseudo, String newColor) {
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