package spaceObjects;

import animalPackage.Animal;
import animalPackage.Bear;
import animalPackage.Chicken;
import animalPackage.Duck;
import animalPackage.Pig;
import animalPackage.Tiger;

/**
 * Class Spacecraft
 */
public class Spacecraft extends Ufo {

	private String color;

	public Animal animal;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor. by default we have a Pig unnamed and a Spacecraft gray
	 * colored at the position OOO
	 */
	public Spacecraft() {
		super();
		this.color = "grey";
		this.animal = new Pig("unnamed");
	}

	/**
	 * Constructor. with selected color
	 * 
	 * @param colorName
	 */
	public Spacecraft(String colorName) {
		super();
		this.color = colorName;
		this.animal = new Pig("unnamed");
	}

	/**
	 * Constructor. with selected animal
	 * 
	 * @param myAnimal
	 */
	public Spacecraft(Animal myAnimal) {
		super();
		this.color = "grey";
		this.animal = myAnimal;
	}

	/**
	 * Constructor. with selected location
	 * 
	 * @param position
	 */
	public Spacecraft(PositionsCube position) {
		super(position);
		this.color = "grey";
		this.animal = new Pig("unnamed");
	}

	/**
	 * Constructor. with selected color and animal
	 * 
	 * @param colorName
	 * @param myAnimal
	 */
	public Spacecraft(String colorName, Animal myAnimal) {
		super();
		this.color = colorName;
		this.animal = myAnimal;
	}

	/**
	 * Constructor. with selected location and color
	 * 
	 * @param position
	 * @param colorName
	 */
	public Spacecraft(PositionsCube position, String colorName) {
		super(position);
		this.color = colorName;
		this.animal = new Pig("unnamed");
	}

	/**
	 * Constructor. with selected location and animal
	 * 
	 * @param position
	 * @param myAnimal
	 */
	public Spacecraft(PositionsCube position, Animal myAnimal) {
		super(position);
		this.color = "grey";
		this.animal = myAnimal;
	}

	/**
	 * Constructor. with selected location, color and animal
	 * 
	 * @param position
	 * @param colorName
	 * @param myAnimal
	 */
	public Spacecraft(PositionsCube position, String colorName, Animal myAnimal) {
		super(position);
		this.color = colorName;
		this.animal = myAnimal;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Getters
	 */
	/**
	 * Get Spacecraft color
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Get Spacecraft animal
	 * 
	 * @return animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Setters
	 */
	/**
	 * Set Spacecraft color
	 * 
	 * @param 1 String = newColor
	 */
	public void setColor(String newColor) {
		this.color = newColor;
	}

	/**
	 * Set Spacecraft animal
	 * 
	 * @param 1 Animal = newAnimal
	 */
	public void setAnimal(Animal newAnimal) {
		this.animal = newAnimal;
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * The Animal will receive damages proportional to the meteoriteSize
	 * 
	 * @param 1 MeteoriteSize = meteoriteSize
	 */
	public void beDamagedBy(MeteoriteSize meteoriteSize) {
		if (meteoriteSize == MeteoriteSize.SMALL) {
			this.animal.decreaseLife(20);
		} else {
			if (meteoriteSize == MeteoriteSize.MEDIUM) {
				this.animal.decreaseLife(50);
			} else {
				if (meteoriteSize == MeteoriteSize.BIG) {
					this.animal.decreaseLife(100);
				}
			}
		}
	}

}