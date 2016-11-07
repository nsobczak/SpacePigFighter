package cubeEnvironment;

import spaceObjects.Meteorite;
import spaceObjects.Spacecraft;
import playerPackage.Player;

public class CubeEnvironment {

  /** 
   *  Pig's spacecraft
   */
  private Spacecraft spacecraft;

  private Meteorite meteoriteSmall;

  private Meteorite meteoriteMedium;

  private Meteorite meteoriteBig;


  /** 
   *  Constructor
   */
  public CubeEnvironment() {
  }
  /**
   * Constuctor 
   * @param playerI
   */
  public CubeEnvironment(Player playerI) {
	  this.spacecraft = playerI.spacecraft;
  }

  public Spacecraft getSpacecraft() {
  return null;
  }

  public Meteorite getMeteoriteSmall() {
  return null;
  }

  public Meteorite getMeteoriteMedium() {
  return null;
  }

  public Meteorite getMeteoriteBig() {
  return null;
  }

  /** 
   *  Set CubeEnvironment spacecraft
   */
  public void setSpacecraft(Spacecraft newSpacecraft) {
  }

  public void setMeteoriteSmall(Meteorite newMeteorite) {
  }

  public void setMeteoriteMedium(Meteorite newMeteorite) {
  }

  public void setMeteoriteBig(Meteorite newMeteorite) {
  }

}