package exerciseGoodsStore;

public class MainTest {

	public static void main(String[] args) {
	
		Goods bookTest1 = new Book("a book", 123, "Very good book", "Billie Jean Monday");
		Goods clothTest1 = new Cloth("Shining light", 789, "shining cloth", 564);
		Goods groceriesTest1 = new Groceries("Carrots", 20, "orange", 1);
		Goods bookTest2 = new Book("a book", 123, "Very good book", "Billie Jean Monday");
		
		
		System.out.println(bookTest1);
		System.out.println(clothTest1);
		System.out.println(groceriesTest1);
		System.out.println(bookTest2);
		
	}

}
