package whileLoops;

import java.util.Scanner;

public class WhileLoops {

	static Scanner thisScanner = new Scanner(System.in);

	public static void main(String[] args) {
		WhileLoops wl = new WhileLoops();

		// wl.exercise1();
		wl.exercise1NewVersion();

		thisScanner.close();
	}// end of main

	public void exercise1() {
		/*
		 * http://www.worldbestlearningcenter.com/index_files/java-loops-while-
		 * exercises.htm Exercise 1: Write Java program to prompt the user to
		 * choose the correct answer from a list of answer choices of a
		 * question. The user can choose to continue answering the question or
		 * stop answering it. See the example below: What is the command keyword
		 * to exit a loop in Java? a. int b. continue c. break d. exit Enter
		 * your choice: b Incorrect! Again? press y to continue:
		 * 
		 * Solution:
		 */

		System.out.println("What is the name of the IDE I'm using?\n" + "1. Netbeans\n" + "2. Eclipse\n"
				+ "3. Intellijay\n" + "\n\nPlease enter your guess (as a number from 1-3):");
		int response = thisScanner.nextInt();
		while (response != 2) {
			System.out.println("Please guess again");
			response = thisScanner.nextInt();
		}

		System.out.println("Good job! Congratulations!");

	} // end of method

	public void exercise1NewVersion() {
		/*
		 * http://www.worldbestlearningcenter.com/index_files/java-loops-while-
		 * exercises.htm Exercise 1: Write Java program to prompt the user to
		 * choose the correct answer from a list of answer choices of a
		 * question. The user can choose to continue answering the question or
		 * stop answering it. See the example below: What is the command keyword
		 * to exit a loop in Java? a. int b. continue c. break d. exit Enter
		 * your choice: b Incorrect! Again? press y to continue:
		 * 
		 * Solution:
		 */

		System.out.println("What is the name of the IDE I'm using?\n" + "1. Netbeans\n" + "2. Eclipse\n"
				+ "3. Intellijay\n"
				+ "4. Frontpage\n"
				+ "5. BitBucket\n" + "\nPlease enter your guess (as a number from 1-5):");
		int response = thisScanner.nextInt();
		while (true) {
			if (response > 0 && response < 6) {
				if (response != 2) {
					System.out.println("Please guess again");
					response = thisScanner.nextInt();
				}else {
					System.out.println("Good job! Congratulations!");
					break;
				}
				
			}else{
				System.out.println("You must enter a number between 1-5.");
				System.out.println("Please guess again");
				response = thisScanner.nextInt();
			}
			
		} //end of while

	} // end of method

}// end of class
