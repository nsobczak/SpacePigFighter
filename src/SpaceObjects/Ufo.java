package SpaceObjects;

/** 
 *  Class UFO, useful to have position in the cube
 */
public abstract class Ufo {

    /** 
     *  Position of one instance of the Position class. Set to (0,0,0) by default.
     */
    private PositionsCube location;

    //====constantes====
    
    //===constructors===
    /** 
     *  Constructor. Set location by default to (0,0,0)
     */
    public void Ufo() {
        this.location = PositionsCube.OOO;
    }
    
    public void Ufo(PositionsCube position) {
        this.location = position;
    }

    //======GET========
    
    public PositionsCube getLocation() {
    return this.location;
    }

    //======SET========
    
    public void setLocation(PositionsCube position) {
        this.location = position; 
    }
    
    //==other Methods=
    

}