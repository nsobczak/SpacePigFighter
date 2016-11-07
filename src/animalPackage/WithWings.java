package animalPackage;

public abstract class WithWings extends Animal {

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
	/**
	 * attack : function which executes a basic attack
	 * 
	 * @param Animal animal_01
	 * @param Animal animal_02
	 * @return nothing
	 */
	public void attack(Animal animal_01, Animal animal_02) {
		System.out.println("I fight with my wings !");
		int damage = animal_01.force - animal_02.resistance;
		animal_02.decreaseLife(damage);
	}
	
	public String specialAction() {
		return "specialAction";
	}

	public void scream() {
	}

}