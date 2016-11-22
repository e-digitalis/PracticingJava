package customers;

public class Customer {

	private static int customerCounter = 0;
	private int	customerID = 0;
	private String name;
	
	
	public Customer(String name) {
		customerCounter++;
		this.customerID = customerCounter;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Customer " + customerID + ": " + name;
	}
	
	
	
	
	
}
