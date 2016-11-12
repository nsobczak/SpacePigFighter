import cubeEnvironment.CubeEnvironment;
import playerPackage.Player;

public class Space implements ExecutionInterface {

	public CubeEnvironment cubeEnvironment_01;

	public CubeEnvironment cubeEnvironment_02;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1
	 *            Player = player_1
	 * @param 1
	 *            Player = player_2
	 */
	public Space(Player player_1, Player player_2) {
		this.cubeEnvironment_01 = new CubeEnvironment(player_1);
		this.cubeEnvironment_02 = new CubeEnvironment(player_2);
	}

	/*
	 * ___________________________________________________________________________________________
	 * Functions
	 */
	/**
	 * run()
	 * 
	 */
	public String run() {
		String result = null;
		return result;
	}
}