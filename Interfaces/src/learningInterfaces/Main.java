package learningInterfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	static ArrayList<Animals> aList = new ArrayList<>();

	public static void main(String[] args) {

		FunnyMethods fm = new FunnyMethods();

		System.out.println("________________ myDolphin ________________");
		CISDolphin myDolphin = new CISDolphin("Linda", true, 0);
		CISDolphin.giveJoy();
		myDolphin.giveJoy();
		myDolphin.eat();

		System.out.println("________________ ccDolphin ________________");
		CuteAndCuddly ccDolphin = new CISDolphin("Bita", true, 0);
		CISDolphin.giveJoy();
		CuteAndCuddly.giveJoy();
		((Animals) ccDolphin).eat();

		System.out.println("________________ aDolphin ________________");
		Animals aDolphin = new CISDolphin("Bardia", true, 0);
		CISDolphin.giveJoy();
		CISDolphin.giveJoy();
		aDolphin.eat();

		System.out.println("________________ cisDolphin ________________");
		CreaturesInTheSea cisDolphin = new CISDolphin("Bessy", true, 0);
		CISDolphin.giveJoy();
		// Animals.giveJoy();
		aDolphin.eat();

		Animals myKitten = new COLKitten("Missy", true, false, 4, true);
		System.out.println(myKitten.getType());
		System.out.println(myDolphin.getType());

		aList.add(myKitten);
		aList.add(aDolphin);
		aList.add(cisDolphin);
		aList.add((Animals) ccDolphin);

		System.out.println("________________ ifPrinting ________________");
		fm.printIfCol(myKitten.getName(), myKitten.getType());
		fm.printIfCol(aDolphin.getName(), aDolphin.getType());
		System.out.println();
		fm.printIfCis(myKitten.getName(), myKitten.getType());
		fm.printIfCis(aDolphin.getName(), aDolphin.getType());
		// fm.printIfCis((CISDolphin)ccDolphin).getName(), ccDolphin.getType());
		fm.printIfCis(myDolphin.getName(), myDolphin.getType());
		fm.printIfCis(myDolphin.getName(), myDolphin.getType());
		fm.printIfCis(cisDolphin.getName(), cisDolphin.getType());

		System.out.println("________________ allPrinting ________________");
		// fm.printAll(myKitten.getName(), myKitten.getType());
		// fm.printAll();

		printOne();
		printAll();

	} // end of main

	public static void printOne() {
		Iterator<Animals> myIterator = aList.iterator();
		Animals value = myIterator.next();
		System.out.println(value);
		}
	
	public static void printAll() {
		for(Animals animalObject : aList){
		System.out.println(animalObject);
		}	
	}

} // end of class
