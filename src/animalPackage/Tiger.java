package animalPackage;

/**
 * ===== Class Tiger =====
 * 
 * @author Nicolas Sobczak
 * @version 1.03, 11/2016
 */
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
	 * @param Animal attackedAnimal
	 */
	@Override
	public void attack(Animal attackedAnimal){
		super.attack(attackedAnimal);
	}		

	/**
	 * attack : function which executes a special attack
	 * 
	 * @param Animal attackedAnimal
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
		System.out.println(this.getPSEUDO() + " roars " + beFierce());
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