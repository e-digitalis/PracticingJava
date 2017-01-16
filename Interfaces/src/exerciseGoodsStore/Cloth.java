package exerciseGoodsStore;

public class Cloth extends Goods implements HasShippingCost {

	static private int typeCounter;
	private int clothID;
	static String type = "cloth";
	
	double size;

			
	public Cloth(String name, double price, String description,  double size) {
		super(++typeCounter, name, price, description);
		this.clothID = ++typeCounter;
		this.size = size;
	}
	
	@Override
	public double calculateCost(double distance) {
		double shippingCost =  PRICEPERMILE * distance;
		return shippingCost;
	}


	public static int getTypeCounter() {
		return typeCounter;
	}


	public int getClothID() {
		return clothID;
	}


	public static String getType() {
		return type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}


}
