package libraryStuff;

public abstract class Material {

	private static Integer idCounter; //The ID counter needs to be an object so an Integer, this is necessary so I can do toString on it
	private String id; //Changing the ID to String means there is a lot of other things to change
	private String title;
	private String branch;
	private Customer borrower;
	boolean isIn;
	
	public Material(String title, String branch) {
		idCounter++;
		this.id = idCounter.toString(); //doing toString on the counter means it's acceptable for the new data type
		this.title = title;
		this.branch = branch;
		boolean isIn = true;
	}

	public String getTitle() {
		return title;
	}

	public int getID(){
		return id;
	}
	
	public void relocate(String newBranch){
		this.branch = newBranch;
	}

	abstract public String getMaterialType();

	
	public boolean lend(Customer customer){
		if (this.borrower == null){
		this.borrower = customer;
		return true;
		} else{
			return false;
		}
	}
	
	
	
	public boolean isIn() {
		return isIn;
	}

	//all abstract methods must be overridden
	//abstract methods cannot have a body or curly brackets
	//they end with a semicolon;
	//to compile correctly they must be implemented in each subclass
	public abstract int getLoanPeriod();
	
}
