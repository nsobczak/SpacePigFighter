package animalPackage;

/**
 * ===== Abstract Class WithPaws =====
 * 
 * @author Nicolas Sobczak
 * @version 1.03, 11/2016
 */
public abstract class WithPaws extends Animal {

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
	 * Functions
	 */
	/**
	 * attack : function which executes a basic attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 */
	public void attack(Animal attackedAnimal) {
		System.out.println("I fight with my paws !");
		int damage = this.force - attackedAnimal.resistance;
		attackedAnimal.decreaseLife(damage);
	}

	/**
	 * attack : function which executes a special attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 */
	public String specialAction(Animal attackedAnimal) {
		return "specialAction";
	}

}