package loans;

import java.time.LocalDateTime;

public class Loan {

	private int loanCounter;
	private int loanID;
	private int materialOnLoan;	//keeps track of WHAT is on loan
	private int customerBorrowing;	//keeps track of WHO is borrowing
	private LocalDateTime startDate;		//sets start date to today
	private LocalDateTime dueDate;		//sets due date two weeks ahead
	private LocalDateTime returnDate; 	// = null when on loan
	private boolean onLoan;		//true when on loan - indicates if material is on loan
	private LoanStatus status;		//Enum that shows status of loan: current and historic


	public Loan(int materialOnLoan, int customerBorrowing) {
		loanCounter++;
		this.loanID = loanCounter;
		this.materialOnLoan = materialOnLoan;
		this.customerBorrowing = customerBorrowing;
		this.startDate = LocalDateTime.now();
		this.dueDate = startDate.plusWeeks(2);
		this.onLoan = true;
		this.status = LoanStatus.CURRENT;
	}


	@Override
	public String toString() {
		return "loanID=" + loanID + ", materialOnLoan=" + materialOnLoan + ", customerBorrowing="
				+ customerBorrowing + ", startDate=" + startDate + ", dueDate=" + dueDate + ", status=" + status;
	}


	public int getMaterialOnLoan() {
		return materialOnLoan;
	}


	public int getCustomerBorrowing() {
		return customerBorrowing;
	}


	public LocalDateTime getDueDate() {
		return dueDate;
	}

	//TODO: equals method for loanIDs
	//equals - to allow us to compare 2 loan objects. Simply
	//compare the IDs to see if they’re the same
	
//	  public boolean void equals(int iD){
//		  private boolean isEqual;
//		  if (this.loanID = iD){
//			  return true;
//		  }
//		  return isEqual;
//	  }
	
	public void endLoan(int LoanID){
		//TODO: ask Bita/Bardia
		setOnLoan(false);
		setStatus(LoanStatus.HISTORIC);
//		LoanRegistry.currentLoans.remove(LoanID);
//		LoanRegistry.historicLoans.add((LoanID));
	}


	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}


	public void setStatus(LoanStatus status) {
		this.status = status;
	}
}
