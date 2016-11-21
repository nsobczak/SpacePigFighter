package animalPackage;

/**
 * ===== Class Pig =====
 * 
 * @author Nicolas Sobczak
 * @version 1.03, 11/2016
 */
public class Pig extends WithPaws {

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
		System.out.println(this.getPSEUDO() + " grunts");
	}


}