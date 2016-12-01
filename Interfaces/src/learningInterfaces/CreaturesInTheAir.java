package learningInterfaces;

public class CreaturesInTheAir extends Animals {

	public CreaturesInTheAir(String name) {
		super(name);
	}

	String type = "CIA";
	final boolean FLY = true; //booleans can be constant/final
	int legs;

	public String fly(){
		return "The flapping moves the air and creates butterfly effect.";
	}
}
