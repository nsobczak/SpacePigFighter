package animalPackage;

public class Duck extends WithWings implements BeGentle {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = duck's Pseudo
	 */
	public Duck(String newPseudo) {
		super(newPseudo);
		this.life = 1200;
		this.force = 110;
		this.resistance = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = duck's Pseudo
	 * @param 1 String = duck's color
	 */
	public Duck(String newPseudo, String newColor) {
		super(newPseudo, newColor);
		this.life = 1200;
		this.force = 110;
		this.resistance = 0;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * attack : function which executes a basic attack
	 * 
	 * @param Animal
	 *            = animal_01 : attacker
	 * @param Animal
	 *            = animal_02 : defender
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
	 * beKind : function which return an adjective to describe behavior
	 * 
	 * @return 1 String = an adjective
	 */
	public String beKind() {
		return "gently";
	}

}