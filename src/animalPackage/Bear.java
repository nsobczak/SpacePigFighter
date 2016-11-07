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
	 */
	public Bear(String newPseudo) {
		super(newPseudo);
		this.life = 1000;
		this.force = 110;
		this.resistance = 40;
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = bear's Pseudo
	 * @param 1 String = bear's color
	 */
	public Bear(String newPseudo, String newColor) {
		super(newPseudo, newColor);
		this.life = 1000;
		this.force = 110;
		this.resistance = 40;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * attack : function which executes a basic attack
	 * 
	 * @param Animal = animal_01 : attacker
	 * @param Animal = animal_02 : defender
	 */
	public void attack(Animal animal_01, Animal animal_02) {
		super.attack(animal_01, animal_02);
	}

	public String specialAction() {
		return null;
	}

	public void scream() {
	}

}