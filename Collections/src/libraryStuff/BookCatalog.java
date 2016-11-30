package libraryStuff;

import java.util.HashMap;

public class BookCatalog {

	private HashMap<String, Book> bookMap;
	// changing the old Array to a HashMap
	// private Book[] bookArray = new Book[100];
	
	public BookCatalog(){
		//constructor for the BookCatalog. Instantiates the declared HasMap.
		bookMap = new HashMap<String, Book>();
	}
	

	public HashMap<String, Book> getBookMap() {
		return bookMap;
	}

	public int getNumberOfBooks() {
		return bookMap.size();
	}

	public void addBook(Book newBook) {
		bookMap.put(newBook.getID(), newBook);
	}

	public Book findBook(String title) throws BookNotFoundException {

		title = title.trim(); // removes empty/spare spaces at the beginning or
		// end of the field we are going to search for

		for (Book thisBook : bookMap.values()) {
			if (thisBook.getTitle().equalsIgnoreCase(title)) {
				return thisBook;
			}
		}

		throw new BookNotFoundException();
	}

}

// code with HashMap key = Integer not String
//package libraryStuff;
//
//import java.util.HashMap;
//
//public class BookCatalog {
//
//	private HashMap<Integer, Book> bookMap;
//	// changing the old Array to a HashMap
//	// private Book[] bookArray = new Book[100];
//	
//	public BookCatalog(){
//		//constructor for the BookCatalog. Instantiates the declared HasMap.
//		bookMap = new HashMap<Integer, Book>();
//	}
//	
//
//	public HashMap<Integer, Book> getBookMap() {
//		return bookMap;
//	}
//
//	public int getNumberOfBooks() {
//		return bookMap.size();
//	}
//
//	public void addBook(Book newBook) {
//		bookMap.put(newBook.getID(), newBook);
//	}
//
//	public Book findBook(String title) throws BookNotFoundException {
//
//		title = title.trim(); // removes empty/spare spaces at the beginning or
//		// end of the field we are going to search for
//
//		for (Book thisBook : bookMap.values()) {
//			if (thisBook.getTitle().equalsIgnoreCase(title)) {
//				return thisBook;
//			}
//		}
//
//		throw new BookNotFoundException();
//	}
//
//}
