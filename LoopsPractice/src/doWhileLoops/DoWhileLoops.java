package doWhileLoops;

import java.util.Scanner;

public class DoWhileLoops {

	static Scanner aScanner = new Scanner(System.in);

	public static void main(String[] args) {
		DoWhileLoops dwl = new DoWhileLoops();

		dwl.printStars();
		dwl.exerciseFromWhileLoop();

		aScanner.close();
	}// end of main
	
	public void printStars(){
		System.out.println("__________ printStars __________");
		
		int counter = 0;
		
		do {
			System.out.print('*');
			counter++;
		} while (counter <10);
		
	}

	public void exerciseFromWhileLoop() {
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
		
		System.out.println("\n__________ exerciseFromWhileLoop __________");
		

		int response;
		
		System.out.println("What is the name of the IDE I'm using?\n" + "1. Netbeans\n" + "2. Eclipse\n"
				+ "3. Intellijay\n");
		do {			
			System.out.println("Please enter a number from 1-3:");
			response = aScanner.nextInt();
		
		} while (response != 2);

		System.out.println("\nGood job! Congratulations!");

	} // end of method

} // end of class
