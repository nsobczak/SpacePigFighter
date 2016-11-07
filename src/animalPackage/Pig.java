package animalPackage;

/**
 * Class pig = pig fighter
 */
public class Pig extends WithPaws implements BeGentle {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = pig's Pseudo
	 */
	public Pig(String newPseudo) {
		super(newPseudo);
		this.life = 1000;
		this.force = 90;
		this.resistance = 40;
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = pig's Pseudo
	 * @param 1 String = pig's color
	 */
	public Pig(String newPseudo, String newColor) {
		super(newPseudo, newColor);
		this.life = 1000;
		this.force = 90;
		this.resistance = 40;
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
		return "kindly";
	}

}