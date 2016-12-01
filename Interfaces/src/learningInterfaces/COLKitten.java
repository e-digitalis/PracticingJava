package learningInterfaces;

public class COLKitten  extends CreaturesOnLand implements CuteAndCuddly {

	
	
	public COLKitten(String name, boolean walk, boolean crawl, int legs, boolean fast) {
		super(name, walk, crawl, legs, fast);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		System.out.println("Interacting with hugs and cuddles");
		
	}

}
