package learningInterfaces;

public interface CuteAndCuddly {

	boolean isCute = true; 		//attributes must be constants
	boolean isCuddly = true;	//they must be initialized
	
	void interact(); 	//methods can be abstract
	
	default String hug(){		//methods can also be implemented
		return "hug";
	}
	
	default String cuddle(){
		return "cuddle";
	}
	
	static String giveJoy(){
		System.out.println("Printing interface version");
		return "A whole lot of joy.";
	}
	

	
}
