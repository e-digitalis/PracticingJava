package customers;

import java.util.ArrayList;


public class CustomerRegistry {

	static ArrayList<Customer> customerArrayList = new ArrayList<Customer>(50);

	//	adds customers
	//uses two different ways of adding customers
	public static void addCustomers(){	
		Customer c1 = new Customer("Maria");
		Customer c2 = new Customer("Patricia");
		Customer c3 = new Customer("Hema");
		Customer c4 = new Customer("Nanna");
		Customer c5 = new Customer("Ellinor");
		customerArrayList.add(c1);
		customerArrayList.add(c2);
		customerArrayList.add(c3);
		customerArrayList.add(c4);
		customerArrayList.add(c5);
		customerArrayList.add(new Customer("Gabriela"));
		customerArrayList.add(new Customer("Asmaa"));
		customerArrayList.add(new Customer("Joyce"));
		customerArrayList.add(new Customer("Barria"));
		customerArrayList.add(new Customer("Marujis"));
		customerArrayList.add(new Customer("Elsa"));

	}	

	//prints all contents in the arraylist
	public static void printCustomerList() {
		for (Customer c : customerArrayList) {
			System.out.println(c);
		}
	}
}