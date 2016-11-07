import cubeEnvironment.CubeEnvironment;

public class Space implements Logger {

	public CubeEnvironment cubeEnvironment_01;

	public CubeEnvironment cubeEnvironment_02;

	/**
	 * Constructor
	 * 
	 * @param 1 Player player_1
	 * @param 1 Player player_2
	 * @return nothing
	 */
	public Space(Player player_1, Player player_2) {
	}

	public void loggingInfo(String info) {
		System.out.println("loggingInfo: " + info);
	}

}