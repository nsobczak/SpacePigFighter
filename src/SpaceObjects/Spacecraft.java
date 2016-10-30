package SpaceObjects;

import Animal.Animal;
import Animal.Pig;
import Animal.Chicken;
import Animal.Bear;
import Animal.Duck;
import Animal.Tiger;



/** 
 *  Class Spacecraft
 */
public class Spacecraft extends Ufo {

    private String color;

    public Animal animal;

    //====constantes====

    //===constructors===
    /** 
     *  Constructor
     */
    public Spacecraft() {
        super();
        this.color = "gray";
        this.animal = new Pig("unnamed");
    }
    
    public Spacecraft(String colorName) {
        super();
        this.color = colorName;
        this.animal = new Pig("unnamed");
    }
    
    public Spacecraft(Animal animalName) {
        super();
        this.color = "gray";
        this.animal = animalName;
    }
    
    //======GET========

    /** 
     *  get spacecraft color
     */
    public String getColor() {
    return null;
    }

    public PositionsCube getPosition() {
    return null;
    }

    public Animal getAnimal() {
    return null;
    }

    //======SET========
    
    /** 
     *  Set spacecraft color
     */
    public void setColor(String newColor) {
    }

    /** 
     *  Set spacecraft position
     */
    public void setPosition(PositionsCube newPosition) {
    }

    public void setAnimal(Animal newAnimal) {
    }

    //==other Methods=
    
    /** 
     *  Fonction qui abime le vaisseau: fait baisser la vie de l'animal
     */
    public void beDamaged() {
    }

}