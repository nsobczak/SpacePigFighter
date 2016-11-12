package animalPackage;

public abstract class WithWings extends Animal {

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 */
	public WithWings(String newPseudo) {
		super(newPseudo);
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
	 */
	public WithWings(String newPseudo, String newColor) {
		super(newPseudo, newColor);
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
		System.out.println("I fight with my wings !");
		int damage = this.force - attackedAnimal.resistance;
		attackedAnimal.decreaseLife(damage);
	}
	
	/**
	 * attack : function which executes a special attack
	 * 
	 * @param Animal attackedAnimal
	 */
	public String specialAction(Animal attackedAnimal) {
		return "specialAction";
	}

	public void scream() {
	}

}