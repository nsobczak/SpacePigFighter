import SpaceObjects.Spacecraft;
import Animal.Animal;

public class Player {

	public Animal animal;

	public Spacecraft spacecraft;

	public Player(Animal newAnimal, Spacecraft newSpacecraft) {
	}

	public Animal getAnimal() {
		return this.animal;
	}

	public Spacecraft getSpacecraft() {
		return this.spacecraft;
	}

	public void setAnimal(Animal newAnimal) {
		this.animal = newAnimal;
	}

	public void setSpacecraft(Spacecraft newSpacecraft) {
		this.spacecraft = newSpacecraft;
	}

}
