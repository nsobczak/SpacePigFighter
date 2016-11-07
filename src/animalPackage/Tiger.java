package animalPackage;

public class Tiger extends WithPaws implements BeFierce {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = tiger's Pseudo
	 */
	public Tiger(String newPseudo) {
		super(newPseudo);
		this.life = 1000;
		this.force = 130;
		this.resistance = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = tiger's Pseudo
	 * @param 1 String = tiger's color
	 */
	public Tiger(String newPseudo, String newColor) {
		super(newPseudo, newColor);
		this.life = 1000;
		this.force = 130;
		this.resistance = 0;
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

	/**
	 * beFierce : function which return an adjective to describe behavior
	 * 
	 * @return 1 String = an adjective
	 */
	public String beFierce() {
		return "savagely";
	}
}