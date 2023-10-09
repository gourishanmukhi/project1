package com.tns.interface2;

public class NonPrime implements Accounts {
int amt;

	
	public NonPrime(int amt) {
	super();
	this.amt = amt;
}

	@Override
	public void deliveryCharges() {
		// TODO Auto-generated method stub
	int	amt=100;
	System.out.println("The delivery charge for nonprime account is" +amt);
	}

	@Override
	public void deliveryCharges(int amt) {
		// TODO Auto-generated method stub
}
}
