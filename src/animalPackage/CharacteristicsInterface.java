package animalPackage;

/**
 * ===== Interface CharacteristicsInterface =====
 * 
 * @author Nicolas Sobczak
 * @version 1.01, 10/2016
 */
public interface CharacteristicsInterface {

	/**
	 * attack
	 * 
	 * @param Animal animal_01
	 * @param Animal animal_02
	 * @return nothing
	 */
	public void attack(Animal animal_01, Animal animal_02);

	/**
	 * attack
	 * 
	 * @param nothing
	 * @return 1 String
	 */
	public String specialAction();

	/**
	 * scream
	 * 
	 * @param nothing
	 * @return nothing
	 */
	public void scream();

}