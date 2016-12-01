package learningInterfaces;

public class CreaturesInTheSea extends Animals {

	boolean swim;
	int legs;
	boolean cis = true;
	String type = "CIS";
	
	public CreaturesInTheSea(String name, boolean swim, int legs) {
		super(name);
		this.swim = swim;
		this.legs = legs;
	}

	
	
	public String getType() {
		return type;
	}



	public String swim(){
		
		if (swim){
			return "Swimming!";
		} else		{
			return "Potentially stationary animal. Can't swim.";
		}
	}
		
}
