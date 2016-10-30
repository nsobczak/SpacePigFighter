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
    
    public Spacecraft(Animal myAnimal) {
        super();
        this.color = "gray";
        this.animal = myAnimal;
    }
            
    public Spacecraft(PositionsCube position) {
        super(position);
        this.color = "gray";
        this.animal = new Pig("unnamed");
    }
    
    public Spacecraft(String colorName, Animal myAnimal) {
        super();
        this.color = colorName;
        this.animal = myAnimal;
    }
    
    public Spacecraft(PositionsCube position, String colorName) {
        super(position);
        this.color = colorName;
        this.animal = new Pig("unnamed");
    }
    
    public Spacecraft(PositionsCube position, Animal myAnimal) {
        super(position);
        this.color = "gray";
        this.animal = myAnimal;
    }
       
    public Spacecraft(PositionsCube position, String colorName, Animal myAnimal) {
        super(position);
        this.color = colorName;
        this.animal = myAnimal;
    }
    
    
    //======GET========

    /** 
     *  get spacecraft color
     */
    public String getColor() {
    return this.color;
    }

    public Animal getAnimal() {
    return this.animal;
    }

    //======SET========
    
    /** 
     *  Set spacecraft color
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setAnimal(Animal newAnimal) {
        this.animal = newAnimal;
    }

    //==other Methods=
    
    /** 
     *  Fonction qui abime le vaisseau: fait baisser la vie de l'animal
     */
    public void beDamaged() {
    }

}