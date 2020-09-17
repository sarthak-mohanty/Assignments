package day3.polymorphism;

import day3.polymorphism.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		if(key==3) {
			return new Tractor();
		}
		return super.getProduct(key);
	}

	@Override
	public void printEstimate(Automobile polyAuto) {
		// TODO Auto-generated method stub
		super.printEstimate(polyAuto);
	}
	
	

}
