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
     * Constructor. Set location by default to (0,0,0)
     */
    public Ufo() {
        this.location = PositionsCube.OOO;
    }
    /**
     * Constructor. with selected position
     * @param position 
     */
    public Ufo(PositionsCube position) {
        this.location = position;
    }

    //======GET========
    
    /**
     * Get the Ufo location
     * @return location
     */
    public PositionsCube getLocation() {
    return this.location;
    }

    //======SET========
    
    /**
     * Set the Ufo location
     * @param 1 PostionsCube = position 
     */
    public void setLocation(PositionsCube position) {
        this.location = position; 
    }
    
    //==other Methods=
    
    /**
     * Change the location of the Ufo on the CubeEnvironment
     * @param 1 PositionsCube = position 
     */
    public void moveUfo(PositionsCube position){
        this.setLocation(position);
    }

}