package materials;

import java.util.ArrayList;


public class BookRegistry {

	static ArrayList<Book> bookArrayList = new ArrayList<Book>(50);

	public static void addBooks(){	
		bookArrayList.add(new Book("Awesome coding"));
		bookArrayList.add(new Book("Girls in tech"));
		bookArrayList.add(new Book("Pink Programming"));
		bookArrayList.add(new Book("Women programmers"));
		bookArrayList.add(new Book("Female programmers"));
		bookArrayList.add(new Book("Programmer Grrrlllls"));

	}	

	//prints all contents in the arraylist
	public static void printBookList() {
		for (Book c : bookArrayList) {
			System.out.println(c);
		}
	}
	
}
