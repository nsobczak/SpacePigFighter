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
	/**
	 * attack : function which executes a basic attack
	 * 
	 * @param Animal animal_01
	 * @param Animal animal_02
	 * @return nothing
	 */
	public void attack(Animal animal_01, Animal animal_02) {
		System.out.println("I fight with my paws !");
		int damage = animal_01.force - animal_02.resistance;
		animal_02.decreaseLife(damage);
	}
	
	public String specialAction() {
		return "specialAction";
	}

	public void scream() {
	}

}