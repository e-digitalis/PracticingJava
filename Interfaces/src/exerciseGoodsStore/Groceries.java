package exerciseGoodsStore;

public class Groceries extends Goods {

	static private int typeCounter;
	private int groceryID;
	static String type = "groceries";
	
	double weight;
	
	public Groceries(String name, double price, String description, double weight) {
		super(++typeCounter, name, price, description);
		this.groceryID = ++typeCounter;
		this.weight = weight;
	}

	public static int getTypeCounter() {
		return typeCounter;
	}

	public int getGroceryID() {
		return groceryID;
	}

	public static String getType() {
		return type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
