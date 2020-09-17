package day2.arrays;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product tv= new Product(23000.00, "LED TV",1010,10,5.00);
		
		ManageProduct mgr = new ManageProduct();
		
		//double discount = mgr.calculateDiscount(tv);
		
		//System.out.println("Discount ---------->"+ discount);
		
		Product fridge= new Product(21000.00,"name",1011,20,10.00);
		//creating an array of type product with sizem2
		
		Product[] productList= new Product[2];
		
		//placing the elements at position o and 1
		
		productList[0]=tv;
		productList[1]=fridge;
		//another way to get things done
		//Product[] productList= {tv,fridge};
		
		mgr.showProductForEach(productList);
		mgr.showProductsLegacy(productList);
		
		double[] discount= mgr.calculateDiscount(productList);
		double[] amount=mgr.calculateAmount(productList);
		double[] discountPrice=mgr.calculateDiscountPrice(amount, discount,productList);
		
		for(int i=0; i<productList.length;i++) {
			System.out.println("Product "+i+ "\n discount " +discount[i]+ "\n amount " +amount[i]+ "\n discountedPrice "+ discountPrice[i]);
		}
		
		
		
		
	}

}
