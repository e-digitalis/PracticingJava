package materials;

public class Book {

	private static int bookCounter;
	private int bookID;
	private String title;	
	
	public Book(String title) {
		this.title = title;
		bookCounter++;
		this.bookID = bookCounter;
	}


	@Override
	public String toString() {
		return "Book " + bookID + ": " + title;
	}
	
	
	
}
