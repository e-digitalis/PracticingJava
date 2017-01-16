package exerciseGoodsStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {

	static List<Goods> myGoodsList = new ArrayList<Goods>();
	
	public void listMethods() {
	Goods book1 = new Book("a book", 123, "Very good book", "Billie Jean Monday");
	Goods cloth1 = new Cloth("Paper plane", 789, "beautiful cloth", 500);
	Goods book2 = new Book("another book", 456, "Very good book", "Billie Jean Monday");
	Goods cloth2 = new Cloth("Green tree", 789, "awesome cloth", 900);
	Goods book3 = new Book("yet another book", 89, "Very good book", "Billie Jean Monday");
	Goods cloth3 = new Cloth("Pink flower", 789, "comfy cloth", 800);
	Goods cloth4 = new Cloth("Lovely birds", 789, "lovely cloth", 400);
	Goods book4 = new Book("happy book", 789, "Very good book", "Billie Jean Monday");
	Goods cloth5 = new Cloth("Rising sun", 789, "warm cloth", 500);
	Goods groceries1 = new Groceries("Carrots", 20, "orange", 1);
	Goods book5 = new Book("good book", 56, "Very good book", "Billie Jean Monday");
	Goods cloth6 = new Cloth("Sunny window", 789, "comfortable cloth", 899);
	Goods groceries2 = new Groceries("Broccoli", 30, "green", 0.25);
	Goods cloth7 = new Cloth("Rippling lake", 789, "soft cloth", 788);
	Goods groceries3 = new Groceries("Cherry tomatoes", 29, "red", 0.20);
	Goods book6 = new Book("awesome book", 78, "Very good book", "Billie Jean Monday");
	Goods cloth8 = new Cloth("Shining light", 789, "shining cloth", 564);


		myGoodsList.add(book1);
		myGoodsList.add(book2);
		myGoodsList.add(book3);
		myGoodsList.add(book4);
		myGoodsList.add(book5);
		myGoodsList.add(book6);
		myGoodsList.add(cloth1);
		myGoodsList.add(cloth2);
		myGoodsList.add(cloth3);
		myGoodsList.add(cloth4);
		myGoodsList.add(cloth5);
		myGoodsList.add(cloth6);
		myGoodsList.add(cloth7);
		myGoodsList.add(cloth8);
		myGoodsList.add(groceries1);
		myGoodsList.add(groceries2);
		myGoodsList.add(groceries3);
	}

	public static void printList(){

		for (Goods goodObj : myGoodsList){
			System.out.println(goodObj);
		}
	}

	// public static void printMap(Map mp) {
	// Iterator it = myGoodsHashMap.values().iterator();
	// while (it.hasNext()) {
	// myGoodsHashMap .Entry pair = (Map.Entry)it.next();
	// System.out.println(pair.getKey() + " = " + pair.getValue());
	// it.remove(); // avoids a ConcurrentModificationException
	// }
	// }

//	 public void mapMethods() {
//		 
//		 Map<Goods> myHashMap = new HashMap<Goods>();
//	 myGoodsHashMap.put(book1.getIdString(), book1);
//	 myGoodsHashMap.put(book2.getIdString(), book1);
//	 myGoodsHashMap.put(book3.getIdString(), book1);
//	 myGoodsHashMap.put(book4.getIdString(), book1);
//	 myGoodsHashMap.put(book5.getIdString(), book1);
//	 myGoodsHashMap.put(book6.getIdString(), book1);
//	 myGoodsHashMap.put(cloth1.getIdString(), cloth1);
//	 myGoodsHashMap.put(cloth2.getIdString(), cloth2);
//	 myGoodsHashMap.put(cloth3.getIdString(), cloth3);
//	 myGoodsHashMap.put(cloth4.getIdString(), cloth4);
//	 myGoodsHashMap.put(cloth5.getIdString(), cloth5);
//	 myGoodsHashMap.put(cloth6.getIdString(), cloth6);
//	 myGoodsHashMap.put(cloth7.getIdString(), cloth7);
//	 myGoodsHashMap.put(cloth8.getIdString(), cloth8);
//	 myGoodsHashMap.put(groceries1.getIdString(), groceries1);
//	 myGoodsHashMap.put(groceries2.getIdString(), groceries2);
//	 myGoodsHashMap.put(groceries3.getIdString(), groceries3);
//	 }

}
