package animalPackage;

public class Chicken extends WithWings implements BeFierce{

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = chicken's Pseudo
	 */
	public Chicken(String newPseudo) {
		super(newPseudo);
		this.life = 800;
		this.force = 130;
		this.resistance = 20;
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = chicken's Pseudo
	 * @param 1 String = chicken's color
	 */
	public Chicken(String newPseudo, String newColor) {
		super(newPseudo, newColor);
		this.life = 800;
		this.force = 130;
		this.resistance = 20;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */

	/**
	 * attack
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
		return "ferociously";
	}

}