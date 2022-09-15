package com.containment;

public class Person 
{
	String cName;
	String product;
	
	public Person(String cName,String product)
	{
		this.cName=cName;
		this.product=product;
	}
	void show()
	{
		System.out.println("Person Name Is : "+cName);
		System.out.println("Person Product is : "+product);
	}

}