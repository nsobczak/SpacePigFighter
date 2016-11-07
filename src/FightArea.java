import animalPackage.Animal;

/**
 * ===== Class FightArea =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 11/2016
 */
public class FightArea {

	public Animal animal_player_01;

	public Animal animal_player_02;

	/*
	 * ___________________________________________________________________________________________
	 * Constructors
	 */
	/**
	 * Constructor
	 * 
	 * @param 1 Player player_01
	 * @param 1 Player player_02
	 * @return nothing
	 */
	public FightArea(Player player_01, Player player_02) {
		this.animal_player_01 = player_01.animal;
		this.animal_player_02 = player_02.animal;
	}


}