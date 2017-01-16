package exerciseGoodsStore;

public interface HasShippingCost {

	double PRICEPERMILE = 5;
	
	public double calculateCost(double distance);

	
//	public static double calculateCost(double distance){
//		double shippingCost =  PRICEPERMILE * distance;
//		return shippingCost;		
//	}
	
}

