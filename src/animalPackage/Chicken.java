package animalPackage;

/**
 * ===== Class Chicken =====
 * 
 * @author Nicolas Sobczak
 * @version 1.03, 11/2016
 */
public class Chicken extends WithWings implements BeFierce {

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
	 * attack : function which executes a basic attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 */
	public void attack(Animal attackedAnimal) {
		super.attack(attackedAnimal);
	}

	/**
	 * attack : function which executes a special attack
	 * 
	 * @param Animal attackedAnimal
	 */
	public String specialAction(Animal attackedAnimal) {
		return super.specialAction(attackedAnimal);
	}

	/**
	 * scream : function which makes the animal scream
	 */
	public void scream() {
		System.out.println(this.getPSEUDO() + " squeals " + beFierce());
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