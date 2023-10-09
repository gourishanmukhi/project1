package com.tns.abstractmethod;
import java.util.Scanner;
public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int amt;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter amount");
      amt=sc.nextInt();
      Accounts1 a;
      a=new NonPrime1(amt);
      a.deliveryCharges(amt);
	}
}
