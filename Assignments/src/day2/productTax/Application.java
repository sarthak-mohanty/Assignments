package day2.productTax;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Product product = new Product(2);
           ManageProduct manage= new ManageProduct();
           
           double tax= manage.calculateTax(product);
           System.out.println("the tax for the product is `"+ tax + "%");
	}

}
