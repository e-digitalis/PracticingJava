package collections;

import java.util.HashMap;
import java.util.Iterator;

import libraryStuff.Book;

public class HashMaps {

	public static void main(String[] args) {

		HashMap<String, Book> aHashMap = new HashMap<String, Book>();
		Book book1 = new Book("45qsdfg", "a book", "M Blank", "123789", "SomePlace", 456);
		Book book2 = new Book("45qsdfg", "another book", "P Blank", "123756", "SomePlace", 123);
		Book book3 = new Book("45qsdfg", "great book", "Xiaoyi Blank", "123756", "SomePlace", 789);
		Book book4 = new Book("45qsdfg", "wonderful book", "Amanda Blank", "123756", "SomePlace", 654);
		Book book5 = new Book("45qsdfg", "fantastic book", "Alma Blank", "123756", "SomePlace", 321);

		aHashMap.put(book1.getTitle(), book1);
		aHashMap.put(book2.getTitle(), book2);
		aHashMap.put(book3.getTitle(), book3);
		aHashMap.put(book4.getTitle(), book4);
		aHashMap.put(book5.getTitle(), book5);

		System.out.println(aHashMap.size());
		aHashMap.remove(book2.getTitle()); // no indexposition, so indicate the
											// key value
		System.out.println("after removing an object: " + aHashMap.size());

		aHashMap.put(book2.getTitle(), book2);

		aHashMap.values().iterator();
		Iterator<Book> booksInList = aHashMap.values().iterator();
		while (booksInList.hasNext()) {
			Book nextBook;
			System.out.println(nextBook = booksInList.next());
			System.out.println(nextBook.getTitle());
		}

		aHashMap.keySet().iterator();
		Iterator<Book> keysInList = aHashMap.values().iterator();
		while (keysInList.hasNext()) {
			Book nextKey;
			System.out.println(nextKey = keysInList.next());
			System.out.println(nextKey.getTitle());
		}

		HashMap<String, Book> mattsMap = new HashMap<String, Book>();
		HashMap<String, Book> aNewMap = new HashMap<String, Book>();

	} // end of main
} // end of class
