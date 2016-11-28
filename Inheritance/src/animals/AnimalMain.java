package animals;

public class AnimalMain {

	public static void main(String[] args) {

		Cats myTameCat = new CatsTame();		//creating a an object of the classes Animal, Cat and Tame cat
		myTameCat.sleep(CatsTame.typeOfAnimal); //calling the sleep method, using variables and sending parameters
		myTameCat.makeSound();					//overriding the makeSound method by having the "exact same" method in each class
		
		Cats myWildCat = new CatsWild();		//creating a an object of the classes Animal, Cat and Wild cat
		myWildCat.eat(CatsWild.typeOfAnimal);	//calling the sleep method, using variables and sending parameters
		myWildCat.makeSound();					//overriding the makeSound method by having the "exact same" method in each class

		Animals.myScan.close();					//closing the scanner to avoid resource leaks
		
		System.out.println("\ntesting testing");
		
		System.out.println(myTameCat.getClass());
		System.out.println(myTameCat.equals(myWildCat));
		System.out.print("makeSound: "); myTameCat.makeSound();
		System.out.println("to string " + myTameCat.toString());
		System.out.println("hash code " + myTameCat.hashCode());
//		myTameCat.notifyAll();
		System.out.println(myTameCat);
		System.out.println(myTameCat.typeOfAnimal);
				
	}

}
