package learningInterfaces;

public abstract class Animals {

	String type = "Animal";
	String name;
	boolean head;
	boolean mouth;
	boolean eyes;
	boolean nose;	
	boolean legs;
	
	
	
	@Override
	public String toString() {
		return "Animals [type=" + type + ", name=" + name + "]";
	}

	public Animals(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void eat(){
		poop();
	}
	
	public String poop(){
		System.out.println("pooping!\n");
		return "poop";
	}
}
