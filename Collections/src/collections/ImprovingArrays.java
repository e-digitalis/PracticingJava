package collections;

import java.util.ArrayList;

public class ImprovingArrays {

	public static void main(String[] args) {

		ArrayList<String> thisArrayList = new ArrayList<String>();
		
		thisArrayList.add("first item");
		thisArrayList.add("second item");
		thisArrayList.add("third item");
		thisArrayList.add("fourth item");
		thisArrayList.add("fifth item");
		//the boolean checks if the add method worked OK
		boolean success = thisArrayList.add("sixth item");
		thisArrayList.add("first item");
		thisArrayList.add("seventh item");
		
		System.out.println("Success = " + success+ ".");
		
		System.out.println(thisArrayList.size());
		
		System.out.println();
		System.out.println("__________________________________");
		System.out.println();
		
		for (int indexPos = 0; indexPos<2; indexPos++){
			thisArrayList.add("Item " + indexPos);
		}
		
		System.out.println(thisArrayList.size());
		for(int indexPosition = 0; indexPosition < thisArrayList.size(); indexPosition++){
			System.out.println(thisArrayList.get(indexPosition));
		}
		
		System.out.println();
		System.out.println("__________________________________");
		System.out.println();
		
		thisArrayList.remove(1);
		
		System.out.println(thisArrayList.size());
		
		for(int indexPosition = 0; indexPosition < thisArrayList.size(); indexPosition++){
			System.out.println(thisArrayList.get(indexPosition));
		}
		
		System.out.println();
		System.out.println("__________________________________");
		System.out.println();
		
		thisArrayList.add(1, "New second item");
		
		System.out.println(thisArrayList.size());
		
		for(int indexPosition = 0; indexPosition < thisArrayList.size(); indexPosition++){
			System.out.println(thisArrayList.get(indexPosition));
		}
	}

}
