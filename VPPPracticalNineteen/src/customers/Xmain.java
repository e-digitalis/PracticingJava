package customers;

public class Xmain {

	public static void main(String[] args) {

		CustomerRegistry.addCustomers();
		CustomerRegistry.printCustomerList();

		materials.BookRegistry.addBooks();
		materials.BookRegistry.printBookList();

		materials.BookRegistry.addBooks();
		materials.BookRegistry.printBookList();
		
	}

}
