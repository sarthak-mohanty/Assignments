package day3.polymorphism.ifaces;

public interface Automobile {
    
	//The following attribute is of type Public static final by default
	String APPNAME="Quotation Generation System";
	
	//whatever you put the methods are going to be public and abstract mentioned or not by default
	public abstract String getColor();
	public String getModel();
	double getPrice();
	
	
	
}
