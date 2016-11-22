package animalPackage;

/**
 * ===== Class Bear =====
 * 
 * @author Nicolas Sobczak
 * @version 1.03, 11/2016
 */
public class Bear extends WithPaws implements BeFierce {

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
	 * @param Animal
	 *            attackedAnimal
	 */
	@Override
	public void attack(Animal attackedAnimal) {
		super.attack(attackedAnimal);
	}

	/**
	 * attack : function which executes a special attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 */
	@Override
	public String specialAction(Animal attackedAnimal) {
		return super.specialAction(attackedAnimal);
	}

	/**
	 * scream : function which makes the animal scream
	 */
	@Override
	public void scream() {
		System.out.println(this.getPSEUDO() + " grunts " + beFierce());
	}

	/**
	 * beFierce : function which return an adjective to describe behavior
	 * 
	 * @return 1 String = an adjective
	 */
	public String beFierce() {
		return "brutally";
	}

}