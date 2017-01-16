package libraryStuff;

import java.util.TreeMap;

public class MaterialCatalogTest {

	public static void main(String[] args) {

		MaterialCatalog mc = new MaterialCatalog();
		TreeMap<String, Material> myMatMap = mc.getMatMap();

		Book book1 = new Book("trew12","introduction to Java", "MG", "123456", "Anytown", 400);
		Book book2 = new Book("hi45", "better Java", "Maria Liszlo", "234567", "Anytown", 150);
		Book book3 = new Book("jhökjh2345", "introduction to advanced Java", "MG", "173456", "Anytown", 320);
		Book book4 = new Book("2345jkj", "even better Java", "Maria Liszlo", "284567", "Anytown", 950);
		Book book5 = new Book("135hg", "more Java", "Maria Liszlo", "284567", "Anytown", 950);
		DVD dvd1 = new DVD("asgw34", "Epic Java reel!", "Some branch", "Alma Dirr", 456798, 120);
		Customer customer = new Customer("Dr.", "Lissssie", "La", "Hejvägen", "0812345678", "liss@great.com", 1,
				GenderType.OTHER);
		
		//tweaking add order to test order in tree
		//moving items around to test
		//now items are added in creation order but still appear in random order
		//must be hashcode order they are sorted in
		mc.addMaterial(book1);
		mc.addMaterial(book2);
		mc.addMaterial(book3);
		mc.addMaterial(book4);
		mc.addMaterial(book5);
		mc.addMaterial(dvd1);
	
	

		
		for(Material nextMat : myMatMap.values()){
			System.out.println(nextMat.getTitle());
		}
		
	}

}
