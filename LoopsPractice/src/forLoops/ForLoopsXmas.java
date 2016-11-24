package forLoops;

public class ForLoopsXmas {

	public static void main(String[] args) {

		ForLoopsXmas flx = new ForLoopsXmas();
		flx.Xmas();

	} // end of main

	public void Xmas() {

		System.out.println("_______________________________");
		System.out.println("Xmas()");

		int counter;
		int firstCounter;
		int secondCounter;
		int lines = 20;

		for (counter = 0; counter < lines; counter++) {
			for (firstCounter = 0; firstCounter < (lines-1)-counter; firstCounter++) {
				System.out.print(' ');
			}
			for (firstCounter = 0; firstCounter < counter; firstCounter++) {
				System.out.print('*');
			}
			for (secondCounter = 0; secondCounter <= counter; secondCounter++) {
				System.out.print('*');
			}
			
			
			System.out.println();
		}
	}// end of method

}
