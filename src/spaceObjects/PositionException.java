package spaceObjects;

/**
 * ===== Class PositionException =====
 * 
 * @author Vincent Reynaert, Nicolas Sobczak
 * @version 1.01, 11/2016
 */
public class PositionException extends Exception {
	public PositionException() {
		System.out
				.println("You try to instance an UFO with a wrong position in the CubeEnvironment. "
						+ "Please choose a number >=0 and <=7");
	}
}
