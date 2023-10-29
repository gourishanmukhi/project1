package com.tns.lambda;

public class Withoutparameters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m = ()->{return "hello";};
		System.out.println(m.greet());	
		}
}
