package spaceObjects;

public class PositionException extends Exception{ 
	  public PositionException(){
		  System.out.println("You try to instance an UFO with a wrong position in the CubeEnvironment. "
		  		+ "Please choose a number >=0 and <=7");
	  }  
}

