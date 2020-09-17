package day2.arrays;

public class Product extends Object{

	//Object is the supercalss and product is the subclass
	
	
	
	
	
	private double ratePerUnit;
	private String productName;
	private int productId;
	private int quantity;
	private double discount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(double ratePerUnit, String productName, int productId, int quantity, double discount) {
		super();
		this.ratePerUnit = ratePerUnit;
		this.productName = productName;
		this.productId = productId;
		this.quantity = quantity;
		this.discount = discount;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.productName + ":" + this.ratePerUnit;
	}
        	
	
	
}
