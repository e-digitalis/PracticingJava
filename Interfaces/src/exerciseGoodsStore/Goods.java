package exerciseGoodsStore;

public class Goods {

	private static int counter;
	private int goodsID;
	private String itemID;
	private String name;
	private double price;
	private String description;
	
	
	public Goods(int typeCounter, String name, double price, String description) {
		this.goodsID = ++counter;
		this.itemID = goodsID + "-" + getClass().getSimpleName() +  "-" + typeCounter;		
		this.name = name;
		this.price = price;
		this.description = description;
	}

		
	@Override
	public String toString() {
		return "Goods [goodsID: " + goodsID + ", itemID: " + itemID + ",  name: " + name + ", price: "
				+ price + ", description=" + description + "]";
	}



	public static int getCounter() {
		return counter;
	}

	public int getGoodsID() {
		return goodsID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIdString() {
		return itemID;
	}
	
	
	
}
