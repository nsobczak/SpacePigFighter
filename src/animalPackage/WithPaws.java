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
	 * @return nothing
	 */
	public WithPaws(String newPseudo) {
		super(newPseudo);
	}
	
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
	 * @return nothing
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
	 * @param nothing
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
	 * @return nothing
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