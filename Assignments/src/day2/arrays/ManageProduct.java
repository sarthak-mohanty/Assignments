package day2.arrays;

public class ManageProduct {
	double[] discount; 
	double[] discountedPrice;
	double[] amount;

	public double[] calculateDiscount( Product[] product) {
		
		
		int i;
		discount = new double[product.length];
		//Example for if-else
		for(i=0;i<product.length;i++) {
		if(product[i].getRatePerUnit() >500 && product[i].getRatePerUnit()<=1000) {
			discount[i]=0.10;
		}else if(product[i].getRatePerUnit() >1000) {
			discount[i]=0.15;
		}
		
	}
        return discount;
	}
	
	public void showProductsLegacy(Product[] productList) {
		
		for(int i=0;i<productList.length;i++) {
			System.out.println("product"+ i + "=>" + productList[i].getProductName());
		}
	}
	
	public void showProductForEach(Product[] productList) {
		
		for(Product eachProduct : productList) {
			System.out.println(eachProduct.getProductName()+ "." + eachProduct.getRatePerUnit());
		}
	}
	
	public double[] calculateAmount(Product[] productList) {
		amount = new double[productList.length];
		
		for(int i=0; i<productList.length;i++) {
			amount[i]= productList[i].getQuantity() * productList[i].getRatePerUnit();
		}
		return amount;
	}
	
	public double[] calculateDiscountPrice(double amount[], double discount[], Product[] productList) {
		discountedPrice = new double[productList.length];
		for(int i=0; i<amount.length;i++) {
			discountedPrice[i]= amount[i]-(amount[i] * discount[i] / 100) ;
		}
		
		return discountedPrice;
	}
}
