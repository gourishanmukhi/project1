package com.tns.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee ob = new Employee("shannu",123);
       System.out.println(ob);
       Employee companyName;//accessing static variable using class name
       ob=new Employee("gowri",345);
       System.out.println(ob);
	}

}
