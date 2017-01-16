package exerciseGoodsStore;

public class Book extends Goods implements HasShippingCost {

	static private int typeCounter;
	private int bookID;
	static String type = "book";
	String author;

		
	public Book(String name, double price, String description, String author) {
		super(++typeCounter, name, price, description);
		this.bookID = ++typeCounter;
		this.author = author;	
	}

	@Override
	public double calculateCost(double distance) {
		double shippingCost =  PRICEPERMILE * distance;
		return shippingCost;
	}
	
	
	

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", author=" + author + "]";
	}

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public static int getCounter() {
		return typeCounter;
	}


	public static void setCounter(int counter) {
		Book.typeCounter = counter;
	}


	public int getBookID() {
		return bookID;
	}


	public void setBookID(int bookID) {
		this.bookID = bookID;
	}


	public String getType() {
		return type;
	}

}
