package forLoops;

public class ForLoopsMathWarehouse {

	//http://www.mathwarehouse.com/programming/java/programming-exercises/loops/for-and-while-loop-practice.php

	public static void main(String[] args) {

		loop1();
		loop2();
		loop3();
		loop4();
		loop5();

	}

	public static void loop1(){
		System.out.println("__________ loop1 __________");
		for(int i = 0; i < 20; i++){
			if(i % 2 == 0){
				System.out.println(i*2);
			}
		}
	}

	public static void loop2(){
		System.out.println("__________ loop2 __________");
		for(int i = 20; i > 0 ; i-- ){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}//end of loop

	}//end of method
	
	public static void loop3(){
		System.out.println("__________ loop3 __________");
		int mysteryInt = 100;
		for(int i = 5; i > 0;i-- ){
			mysteryInt -= i;
			System.out.println(mysteryInt);
		}//end of loop

	}//end of method
	
	public static void loop4(){
		System.out.println("__________ loop4 __________");
		for(int i = 5; i > 0;i-- ){
			int mysteryInt = 100;
			mysteryInt -= i;
		System.out.println(mysteryInt);
		}//end of loop

	}//end of method
	
	public static void loop5(){
		System.out.println("__________ loop5 __________");
		int mysteryInt = 1;
		int counter=1;
		while(mysteryInt <  3 ) {
				mysteryInt = mysteryInt* counter;
				counter++;
		}//end of loop
		System.out.println(mysteryInt);
		System.out.println(counter);

	}//end of method
	
}//end of class