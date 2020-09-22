package day5.fileHandling.model;

import java.io.Serializable;

public class CreditCard implements Serializable {

	private long creditCardNumber;
	private String nameOncard;
	private transient long creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(long creditCardNumber, String nameOncard) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.nameOncard = nameOncard;
	}
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getNameOncard() {
		return nameOncard;
	}
	public void setNameOncard(String nameOncard) {
		this.nameOncard = nameOncard;
	}
	public long getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return  creditCardNumber + "," + nameOncard ;
	}
	
	
	
}
