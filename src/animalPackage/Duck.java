package animalPackage;

/**
 * ===== Class Duck =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.03, 11/2016
 */
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
	 * @param Animal
	 *            attackedAnimal
	 */
	@Override
	public void attack(Animal attackedAnimal) {
		super.attack(attackedAnimal);
	}

	/**
	 * specialAction : function which executes a special attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 * @return String
	 */
	@Override
	public String specialAction(Animal attackedAnimal) {
		String act = new String();
		if (this.specialActionAvailable > 0) {
			System.out.println("use special action");

			act = "Fly";

			this.specialActionAvailable--;
		} else {
			System.out.println("special action isn't available anymore");
			this.scream();
		}
		return super.specialAction(attackedAnimal) + act;
	}

	/**
	 * scream : function which makes the animal scream
	 */
	@Override
	public void scream() {
		System.out.println(this.getPSEUDO() + " gossips");
	}

}