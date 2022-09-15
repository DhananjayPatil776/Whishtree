package com.interfac;

import java.util.Date;

interface date1
{
	void print_date(Date d);
}
class Employee implements date1
{
	String name="Ram";
	int age=23;

	@Override
	public void print_date(Date d) {
		System.out.println("Name is.."+name);
		System.out.println("Age is..."+age);
		System.out.println("Joining Date is..."+d);
		
	}
	
}
class Customer implements date1
{
	String name="Ramesh";
	int age=25;

	@Override
	public void print_date(Date d) {
		System.out.println("Name is..."+name);
		System.out.println("Age Is ..."+age);
		System.out.println("Birth DAte is..."+d);
		
	}
	
}


public class CurrentDate {

	public static void main(String[] args) {
	
		int a='A';
		System.out.println(a);
		Date d=new Date();
		
		System.out.println(d);
		System.out.println("------------");
		
		date1 dt=new Customer();
		dt.print_date(d);
		
		date1 dt1=new Customer();
		dt1.print_date(d);
		

	}

}
