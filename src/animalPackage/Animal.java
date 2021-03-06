package animalPackage;

import java.util.Scanner;

import stuff.Defensif;
import stuff.Offensif;

/**
 * ===== Abstract Class Animal =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public abstract class Animal {

	/*
	 * ___________________________________________________________________________________________
	 * Properties
	 */
	private final String PSEUDO;

	protected String color;

	protected Integer life;

	protected Integer force;

	protected Integer resistance;

	protected Defensif stuffDefensif;

	protected Offensif stuffOffensif;

	protected Integer specialActionAvailable;

	protected Boolean ableToAct;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 */
	public Animal(String newPseudo) {
		this.PSEUDO = newPseudo;
		this.color = "pink";
		this.specialActionAvailable = 3;
		this.ableToAct = true;
	}

	/**
	 * Constructor
	 * 
	 * @param 1 String = animal's Pseudo
	 * @param 1 String = animal's color
	 */
	public Animal(String newPseudo, String newColor) {
		this.PSEUDO = newPseudo;
		this.color = newColor;
		this.specialActionAvailable = 3;
		this.ableToAct = true;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get animal's color
	 * 
	 * @return 1 String = animal's color value
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Get animal's force
	 * 
	 * @return 1 int = animal's force value
	 */
	public Integer getForce() {
		return this.force;
	}

	/**
	 * Get animal's life
	 * 
	 * @return 1 int = animal's life value
	 */
	public Integer getLife() {
		return this.life;
	}

	/**
	 * Get animal's pseudo
	 * 
	 * @return 1 String = animal's pseudo value
	 */
	public String getPSEUDO() {
		return this.PSEUDO;
	}

	/**
	 * Get animal's resistance
	 * 
	 * @return 1 int = animal's resistance value
	 */
	public Integer getResistance() {
		return this.resistance;
	}

	/**
	 * Get animal's defensif stuff
	 * 
	 * @return 1 Defensif = animal's defensif stuff
	 */
	public Defensif getStuffDefensif() {
		return this.stuffDefensif;
	}

	/**
	 * Get animal's offensif stuff
	 * 
	 * @return 1 Offensif = animal's offensif stuff
	 */
	public Offensif getStuffOffensif() {
		return this.stuffOffensif;
	}

	/**
	 * Get animal's specialActionAvailable
	 * 
	 * @return 1 int = animal's specialActionAvailable
	 */
	public Integer getSpecialActionAvailable() {
		return this.specialActionAvailable;
	}

	/**
	 * Get animal's ableToAct
	 * 
	 * @return 1 Boolean = animal's ability to act
	 */
	public Boolean getAbleToAct() {
		return this.ableToAct;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set animal's color
	 * 
	 * @param 1 String = animal's color value
	 */
	public void setColor(String colorValue) {
		this.color = colorValue;
	}

	/**
	 * Set animal's force
	 * 
	 * @param 1 int = animal's force value
	 */
	public void setForce(Integer forceValue) {
		this.force = forceValue;
	}

	/**
	 * Set animal's resistance
	 * 
	 * @param 1 int = animal's resistance value
	 */
	public void setResistance(Integer resistanceValue) {
		this.resistance = resistanceValue;
	}

	/**
	 * Set animal's life
	 * 
	 * @param 1 int = animal's life value
	 */
	public void setLife(Integer lifeValue) {
		this.life = lifeValue;
	}

	/**
	 * Set animal's defensif stuff
	 * 
	 * @param 1 Defensif = animal's defensif stuff
	 */
	public void setStuffDefensif(Defensif newDefensif) {
		this.stuffDefensif = newDefensif;
	}

	/**
	 * Set animal's offensif stuff
	 * 
	 * @param 1 Offensif = animal's offensif stuff
	 */
	public void setStuffOffensif(Offensif newOffensif) {
		this.stuffOffensif = newOffensif;
	}

	/**
	 * Get animal's specialActionAvailable
	 * 
	 * @param 1 int = animal's newSpecialActionAvailable
	 */
	public void setSpecialActionAvailable(int newSpecialActionAvailable) {
		this.specialActionAvailable = newSpecialActionAvailable;
	}

	/**
	 * Set animal's ableToAct
	 * 
	 * @parm 1 Boolean = animal's ability to act
	 */
	public void setAbleToAct(Boolean abilityToAct) {
		this.ableToAct = abilityToAct;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * Apply animal's stuff bonus
	 * 
	 * @param 1 Offensif offensifStuff
	 * @param 1 Defensif defensifStuff
	 */
	public void updateStuffBonus(Offensif offensifStuff, Defensif defensifStuff) {
		this.force += offensifStuff.getBonusForce();
		this.resistance += defensifStuff.getBonusResistance();
	}

	/**
	 * stuffSelection
	 */
	public void stuffSelection() {
		// offensifStuffSelection + defensifStuffSelection
		boolean isBuildSelected = false;
		String buildSelected = null;
		Scanner scan = new Scanner(System.in);

		// instructions
		String instructions = getClass().getSimpleName()
				+ " "
				+ this.getPSEUDO()
				+ ", select your stuff. You have 2 skill points to split/share.\n"
				+ "| 1 for an offensive build (2 offensive points, 0 defensive point) |\n"
				+ "| 2 for a well balanced build (1 offensive point, 1 defensive point) |\n"
				+ "| 3 for a defensive build (0 offensive point, 2 defensive points) |\n"
				+ "| 4 for extra info |";
		// selection
		while (!isBuildSelected) {
			System.out.println(instructions);
			buildSelected = scan.nextLine();
			try {
				int buildSelectedInt = Integer.parseInt(buildSelected);
				if ((buildSelectedInt >= 1) && (buildSelectedInt <= 3)) {
					isBuildSelected = true;
					// stuff selection switch
					switch (buildSelectedInt) {
					case 1:
						System.out.println("Offensive build chosen");
						this.setStuffOffensif(Offensif.AXE);
						this.setStuffDefensif(Defensif.NONE);
						break;
					case 2:
						System.out.println("Well balanced build chosen");
						this.setStuffOffensif(Offensif.SWORD);
						this.setStuffDefensif(Defensif.HELMET);
						break;
					default:
						System.out.println("Defensive build chosen");
						this.setStuffOffensif(Offensif.NONE);
						this.setStuffDefensif(Defensif.SHIELD);
					}
					// apply bonus
					this.updateStuffBonus(this.getStuffOffensif(),
							this.getStuffDefensif());
				} else if (buildSelectedInt == 4) {
					System.out.println("- Offensive build = an Axe \n"
							+ "- Well balanced build = a Sword + an Helmet \n"
							+ "- Defensive build = a Shield");

				} else {
					System.out.println("Please enter a number between 1 and 4");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number");
			} catch (NullPointerException e) {
				System.out.println("Please enter a number");
			}
			// scan.close(); // Ca merde quand on close => etrange !
		}
	}

	/**
	 * Decrease animal's life
	 * 
	 * @param 1 Integer = damages
	 */
	public void decreaseLife(Integer damages) {
		this.setLife(this.life - damages);
	}

	/**
	 * Increase animal's life
	 * 
	 * @param 1 Integer = bonus
	 */
	public void increaseLife(Integer bonus) {
		this.setLife(this.life + bonus);
	}

	/**
	 * attack : abstract function which executes a normal attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 */
	public abstract void attack(Animal attackedAnimal);

	/**
	 * attack : abstract function which executes a special attack
	 * 
	 * @param Animal
	 *            attackedAnimal
	 */
	public abstract String specialAction(Animal attackedAnimal);

	/**
	 * scream : function which makes the animal scream
	 */
	public abstract void scream();

}