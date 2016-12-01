package learningInterfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class FunnyMethods {

	Main myMain = new Main();
	
	public void printIfCol(String name, String type){
		if(type == "COL"){
			System.out.println(name);
		}
	}
	
	public void printIfCis(String name, String type){
		if(type == "CIS"){
			System.out.println(name);
		}
	}
	
	public void print(String name, String type){
				System.out.println(type + " " +name);
		}
	
//	public static void printAll(ArrayList list){
//		Iterator<Animals> myIterator = list.iterator();
//		Animals value = myIterator.next();
//		System.out.println(type + " " +name);
//}

	
}
