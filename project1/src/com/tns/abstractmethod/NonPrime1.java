package com.tns.abstractmethod;

public class NonPrime1 implements Accounts1 {
	 int amt;
	 
		public NonPrime1() {
			super();
		}

		public NonPrime1(int amt) {
			super();
			this.amt = amt;
		}

		public int getAmt() {
			return amt;
		}

		public void setAmt(int amt) {
			this.amt = amt;
		}

		@Override
		public void deliveryCharges(int amt) {
			// TODO Auto-generated method stub
			System.out.println("the amt is:" +amt);
		}
}
