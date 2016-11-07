package animalPackage;

public abstract class WithPaws extends Animal implements CharacteristicsInterface {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 */
	public WithPaws(String newPseudo) {
		super(newPseudo);
	}
	
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
	 */
	public WithPaws(String newPseudo, String newColor) {
		super(newPseudo, newColor);
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
	
	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set animal's color
	 * 
	 * @param 1 String = animal's color value
	 */
	
	
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