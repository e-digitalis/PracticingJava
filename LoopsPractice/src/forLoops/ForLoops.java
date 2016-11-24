package forLoops;

public class ForLoops {

	public static void main(String[] args) {
		// exercises come from here:
		// http://www.worldbestlearningcenter.com/index_files/java-loops-for-exercises.htm

		ForLoops fl = new ForLoops();
		fl.doubleForLoop();
		fl.doubleForLoop2();
		fl.oneForLoopDown();
		fl.oneForLoopDown2();
		fl.oneForLoop();
		fl.oneForLoop2();
		fl.oneForLoop3();
		fl.oneForLoop4();
	

	} // end of main

	public void doubleForLoop() {

		System.out.println("_______________________________");
		System.out.println("doubleForLoop()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 0; counter < 7; counter++) {
			for (insideCounter = 0; insideCounter < counter-1; insideCounter++) {
				System.out.print(star);
			}
			System.out.println();
		}
	} // end of method
	
	public void doubleForLoop2() {

		System.out.println("_______________________________");
		System.out.println("doubleForLoop2()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 0; counter < 7; counter++) {
			for (insideCounter = 0; insideCounter < 7-counter; insideCounter++) {
				System.out.print(star);
			}
			System.out.println();
		}
	} // end of method
	
	public void doubleForLoop3() {

		System.out.println("_______________________________");
		System.out.println("doubleForLoop3()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 0; counter < 7; counter++) {
			for (insideCounter = 0; insideCounter < 6; insideCounter++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
	} // end of method
	
	public void oneForLoop() {

		System.out.println("_______________________________");
		System.out.println("oneForLoop()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 0; counter < 7; counter++) {
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(star);
			}
			// System.out.print("star");
			System.out.println();
		}
	} // end of method

	public void oneForLoop2() {

		System.out.println("_______________________________");
		System.out.println("oneForLoop2()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 1; counter <= 5; counter++) {
			// System.out.println("b");
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(" ");
			}
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(star);
			}
			// System.out.print("star");
			System.out.println();
			// System.out.println("e");
		}
	} // end of method

	public void oneForLoop3() {

		System.out.println("_______________________________");
		System.out.println("oneForLoop3()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 0; counter < 7; counter++) {
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(star);
				System.out.print(" ");
			}
			// System.out.print("star");
			System.out.println();
		}
	} // end of method

	public void oneForLoop4() {

		System.out.println("_______________________________");
		System.out.println("oneForLoop4()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 0; counter <= 3; counter++) {
			System.out.println("b");
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(star);
			}
			// System.out.print("star");
			System.out.println("e");
		}
	} // end of method

	public void oneForLoopDown() {

		System.out.println("_______________________________");
		System.out.println("oneForLoopDown()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 3; counter >= 0; counter--) {
			System.out.println("b");
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(star);
			}
			// System.out.print("star");
			System.out.println("e");
		}
	} // end of method

	public void oneForLoopDown2() {

		System.out.println("_______________________________");
		System.out.println("oneForLoopDown2()");

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 9; counter >= 0; counter--) {
			for (insideCounter = 0; insideCounter < counter; insideCounter++) {
				System.out.print(star);
			}
			System.out.println();
		}
	} // end of method

}// end of main
