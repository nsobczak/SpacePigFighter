package Animal;

public abstract class WithWings extends Animal implements Characteristics {

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
	public WithWings(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
	 * @return nothing
	 */
	public WithWings(String newPseudo, String newColor) {
		super(newPseudo, newColor);
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	public void attack() {
	}

}