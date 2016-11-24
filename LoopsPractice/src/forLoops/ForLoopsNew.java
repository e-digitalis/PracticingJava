package forLoops;

public class ForLoopsNew {

	public static void main(String[] args) {

		// exercises come from here:
		// http://www.worldbestlearningcenter.com/index_files/java-loops-for-exercises.htm

		ForLoopsNew fln = new ForLoopsNew();
		fln.exercise1();
		fln.exercise1version2();
		fln.exercise2();
		fln.exercise3();

	}// end of main

	public void exercise1() {
		/*
		 * Exercise 1: Write a Java program by using two for loops to produce
		 * the output shown below: *******
		 ******
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("__________ exercise1 __________");

		int counter;
		int insideCounter;
		int lines = 7;
		for (counter = 0; counter < lines; counter++) {
			// outer forloop printes new lines
			for (insideCounter = 0; insideCounter < (lines - counter); insideCounter++) {
				// inside forloop prints stars per line
				System.out.print('*');
			}
			System.out.println(" ");
		}

	} // end of method

	public void exercise1version2() {
		/*
		 * Exercise 1: Write a Java program by using two for loops to produce
		 * same as above
		 */
		System.out.println("__________ exercise1version2 __________");

		int counter;
		int insideCounter;
		int lines = 7;
		for (counter = 0; counter < lines; counter++) {
			for (insideCounter = 0; insideCounter > (counter - lines); insideCounter--) {
				System.out.print('*');
			}
			System.out.println(" ");
		}

	} // end of method

	public void exercise2() {
		/*
		 * Exercise 1: Write a Java program by using two for loops to produce
		 * the output shown below: 
		 * 1******
		 * 
		 * 12*****
		 * 
		 * 123****
		 * 
		 * 1234***
		 * 
		 * 12345**
		 * 
		 * 123456*
		 * 
		 * 1234567
		 */
		System.out.println("__________ exercise2 __________");

		int counter;
		int insideCounter;
		int newCounter;
		int lines = 7;
		for (counter = 0; counter < lines; counter++) {
			for (newCounter = 1; newCounter < counter+2; newCounter++){
			System.out.print(newCounter);
		}
			// outer forloop printes new lines
			for (insideCounter = 0; insideCounter < (lines - counter); insideCounter++) {
				// inside forloop prints stars per line
				System.out.print('*');
			}
			System.out.println();
		}

	} // end of method
	
	public void exercise3() {
		/*
		 * Exercise 1: Write a Java program by using two for loops to produce
		 * the output shown below: 
		 * 1******
		 * 
		 * 12*****
		 * 
		 * 123****
		 * 
		 * 1234***
		 * 
		 * 12345**
		 * 
		 * 123456*
		 * 
		 * 1234567
		 */
		System.out.println("__________ exercise2 __________");

		int counter;
		int insideCounter;
		int newCounter;
		int lines = 7;
		for (counter = 0; counter < lines; counter++) {
			for (newCounter = 1; newCounter < counter+2; newCounter++){
			System.out.print(newCounter);
		}
			// outer forloop printes new lines
			for (insideCounter = 0; insideCounter < (lines - counter); insideCounter++) {
				// inside forloop prints stars per line
				System.out.print('*');
			}
			System.out.println();
		}

	} // end of method

}// end of class
