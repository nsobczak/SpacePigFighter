import spaceObjects.Spacecraft;
import animalPackage.Animal;
import animalPackage.Bear;
import animalPackage.Chicken;
import animalPackage.Duck;
import animalPackage.Pig;
import animalPackage.Tiger;

/**
 * ===== Class Player =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public class Player {

	public Animal animal;

	public Spacecraft spacecraft;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor with animal
	 * 
	 * @param 1 int animalClass
	 * @param 1 String newPseudo
	 * @param 1 String animalColor
	 * @param 1 String spacecraftColor
	 * @return nothing
	 */
	public Player(int animalClass, String newPseudo, String animalColor, String spacecraftColor){

		Animal newAnimal = null;
		// 1 for Bear | 2 for Chicken | 3 for Duck | 4 for Pig | 5 for Tiger
		switch (animalClass) {
		case 1:
			System.out.println("Bear chosen");
			newAnimal = new Bear(newPseudo, animalColor);
			break;
		case 2:
			System.out.println("Chicken chosen");
			newAnimal = new Chicken(newPseudo, animalColor);
			break;
		case 3:
			System.out.println("Duck chosen");
			newAnimal = new Duck(newPseudo, animalColor);
			break;
		case 5:
			System.out.println("Tiger chosen");
			newAnimal = new Tiger(newPseudo, animalColor);
			break;
		default:
			System.out.println("Pig chosen");
			newAnimal = new Pig(newPseudo, animalColor);
		}
		this.animal = newAnimal;

		Spacecraft newSpacecraft = new Spacecraft(spacecraftColor, this.animal);
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
