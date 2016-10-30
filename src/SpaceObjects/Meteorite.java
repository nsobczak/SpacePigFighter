package SpaceObjects;


/** 
 *  Class Meteorite
 */
public class Meteorite extends Ufo {

    private MeteoriteSize size;

    //====constantes====

    //===constructors===
    
    /**
     * Constructor where size is necessary selected by the player
     * 
     * @param 1 MeteoriteSize = meteoriteSize 
     */
    public Meteorite(MeteoriteSize meteoriteSize) {
        super();
        this.size = meteoriteSize;
    }    
    /**
     * Constructor with selected position and size
     * 
     * @param position
     * @param meteoriteSize 
     */
    public Meteorite(PositionsCube position, MeteoriteSize meteoriteSize) {
        super(position);
        this.size = meteoriteSize; 
    }

    
    //======GET========
    
    /**
     * Get the meteorite size
     * @return size
     */
    public MeteoriteSize getSize() {
        return this.size;
    }

    //======SET========

    /** 
     * Set a new size to the meteorite
     * @param 1 MeteoriteSize = newSize 
     */
    public void setSize(MeteoriteSize newSize) {
        this.size = newSize;
    }


}