package loans;

import java.util.ArrayList;

import materials.Book;

public class LoanRegistry {

	static ArrayList<Loan> currentLoans = new ArrayList<Loan>(50);
	static 	ArrayList<Loan> historicLoans = new ArrayList<Loan>(50);
	
	Loan l1 = new Loan(2,5);
//	Loan l2 = new Loan();
//	Loan l3 = new Loan();
//	Loan l4 = new Loan();

	public static void addCurrentLoans(){	
		currentLoans.add(new Loan(1,11));
		currentLoans.add(new Loan(2,8));
		currentLoans.add(new Loan(3,3));
		currentLoans.add(new Loan(4,5));
		currentLoans.add(new Loan(5,7));
		currentLoans.add(new Loan(6,3));
		
	}
		public static void addHistoricLoans(){	
			//TODO: ask - how do I transfer the actual loan from current to historic?
		historicLoans.add(new Loan(1,2));
		historicLoans.add(new Loan(2,1));
		historicLoans.add(new Loan(3,5));
		historicLoans.add(new Loan(4,10));
		historicLoans.add(new Loan(5,9));
		historicLoans.add(new Loan(6,6));
	
	}
}
