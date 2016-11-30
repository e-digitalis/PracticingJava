package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	public static void main(String[] args) {
		
		HashSet<String> thisHashSet = new HashSet<String>();
		
		thisHashSet.add("first item");
		thisHashSet.add("second item");
		thisHashSet.add("third item");
		thisHashSet.add("fourth item");
		thisHashSet.add("fifth item");
		//the boolean checks if the add method worked OK
		boolean success = thisHashSet.add("sixth item");
		thisHashSet.add("first item"); //cannot add duplicate items
		thisHashSet.add("seventh item");
		thisHashSet.add("first item");
		thisHashSet.add("seventh item");
		thisHashSet.add("first item");
		thisHashSet.add("seventh item");
		
		System.out.println("Success = " + success+ ".");
		
		System.out.println(thisHashSet.size());
		
		System.out.println();
		System.out.println("__________________________________");
		System.out.println();
		
		for (int indexPos = 0; indexPos<10; indexPos++){
			thisHashSet.add("Item " + indexPos);
		}
		
		// doesn't work because there are no set positions in hashsets
		//use an iterator instead
//		System.out.println(thisHashSet.size());
//		for(int indexPosition = 0; indexPosition < thisHashSet.size(); indexPosition++){
//			System.out.println(thisHashSet.get(indexPosition));
//		}
		
		Iterator<String> anIterator = thisHashSet.iterator();
		while(anIterator.hasNext()){
			String nextString;
			System.out.println(nextString = anIterator.next());
			System.out.println(nextString);
		}
		
		System.out.println();
		System.out.println("__________________________________");
		System.out.println();
		
		System.out.println(thisHashSet.size());
		thisHashSet.remove("second item"); //cannot remove by "indexposition", item must be specified
		System.out.println(thisHashSet.size());
		
		while(anIterator.hasNext()){
			String nextString = anIterator.next();
			System.out.println(nextString);
		}
		
		System.out.println();
		System.out.println("__________________________________");
		System.out.println();
		
//		thisHashSet.add(1, "New second item");
		
		System.out.println(thisHashSet.size());
		
		while(anIterator.hasNext()){
			String nextString = anIterator.next();
			System.out.println(nextString);
		}
		
	}
	
}
