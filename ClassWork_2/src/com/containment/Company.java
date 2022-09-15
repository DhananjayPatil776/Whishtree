package com.containment;

public class Company 
{
	String pName;
	String pAddress;
	Person c;
	
	Company(String pName,String pAddress,Person c)
	{
		this.pName=pName;
		this.pAddress=pAddress;
		this.c=c;
	}
	
	void display()
	{
		System.out.println("Company Name : "+pName);
		System.out.println("Company Adddress is : "+pAddress);
		c.show();
	}

	public static void main(String[] args) 
	{
	 Person c=new Person("Accenture","Software");
	 Company p=new Company("Arjun", "Nagar", c);
	 p.display();
	 
	 

	}

}