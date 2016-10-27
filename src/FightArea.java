import Animal.Animal;

public class FightArea implements Logger {

  public Animal player_01;

  public Animal player_02;

  /** 
   *  Constructor
   */
  public FightArea() {
  }

  public void loggingInfo(String info) {
	  System.out.println("loggingInfo: " + info);
  }

}