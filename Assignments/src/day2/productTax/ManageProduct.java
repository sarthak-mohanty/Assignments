package day2.productTax;

public class ManageProduct {

	public double calculateTax (Product product ) {
		double tax;
		switch(product.getProductType()) {
		
		case 1:
			tax=5;
			break;
		
		case 2:
			tax=10;
			break;
		
		case 3:
			tax=15;
			break;
			
		default:
			tax=28;
		}
		return tax;
	}
}
