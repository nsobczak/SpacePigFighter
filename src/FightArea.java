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
	 * @param 1 Player newPlayer_01
	 * @param 1 Player newPlayer_02
	 * @return nothing
	 */
	public FightArea(Player newPlayer_01, Player newPlayer_02) {
		this.animal_player_01 = newPlayer_01.animal;
		this.animal_player_02 = newPlayer_02.animal;
	}


}