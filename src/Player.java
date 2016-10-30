import spaceObjects.Spacecraft;
import animalPackage.Animal;

public class Player {

	public Animal animal;

	public Spacecraft spacecraft;

	/**
	 * Constructor with selected location and animal
	 * 
	 * @param nothing
	 * @return nothing
	 */
	public Player(String newPseudo) {

//		Animal newAnimal = new Animal(newPseudo);
//		this.animal = newAnimal;

		Spacecraft newSpacecraft = new Spacecraft();
		this.spacecraft = newSpacecraft;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get player's animal
	 * 
	 * @param nothing
	 * @return 1 Animal = player's animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	/**
	 * Get player's spacecraft
	 * 
	 * @param nothing
	 * @return 1 Spacecraft = player's spacecraft
	 */
	public Spacecraft getSpacecraft() {
		return this.spacecraft;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set player's animal
	 * 
	 * @param 1 Animal = newAnimal
	 */
	public void setAnimal(Animal newAnimal) {
		this.animal = newAnimal;
	}

	/**
	 * Set player's spacecraft
	 * 
	 * @param 1 Spacecraft = newSpacecraft
	 */
	public void setSpacecraft(Spacecraft newSpacecraft) {
		this.spacecraft = newSpacecraft;
	}

}
