package learningInterfaces;

public class CreaturesOnLand extends Animals {

	String type = "COL";
	boolean walk;
	boolean crawl;
	
	int legs;
	boolean fast;

	
	public CreaturesOnLand(String name, boolean walk, boolean crawl, int legs, boolean fast) {
		super(name);
		this.walk = walk;
		this.crawl = crawl;
		this.legs = legs;
		this.fast = fast;
	}

	
	
	public String getType() {
		return type;
	}



	public String walk(){
		
		if (legs > 0 && walk == true){
			return "Can walk!";
		} else		{
			return "Potentially stationary animal. Can't walk.";
		}
	}
	
	public String run(){
		
		if (fast && walk){
			return "Can run!";
		} else		{
			return "Potentially stationary animal. Can't run.";
		}
	}
	
}
