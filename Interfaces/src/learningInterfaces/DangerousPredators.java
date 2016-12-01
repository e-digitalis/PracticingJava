package learningInterfaces;

//Where classes define existence, interfaces define behaviour.
//Classes define what something is,
//while interfaces define what something does.


public interface DangerousPredators {

	String ANIMALTYPE = "dangerousPredator"	;		//attributes must be constants
	boolean isPredator = true;						//they must be initialized


	public void attack();		//all methods are public by default
	void eat();					//whether you declare that or not

}