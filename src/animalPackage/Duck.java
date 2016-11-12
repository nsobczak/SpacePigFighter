package animalPackage;

public class Duck extends WithWings {

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
	 * @param Animal attackedAnimal
	 */
	public void attack(Animal attackedAnimal){
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

	public void scream() {
	}


}