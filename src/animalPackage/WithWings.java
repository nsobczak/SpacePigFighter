package animalPackage;

public abstract class WithWings extends Animal implements CharacteristicsInterface {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 */
	public WithWings(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
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
	
	public String specialAction() {
		return "specialAction";
	}

	public void scream() {
	}

}