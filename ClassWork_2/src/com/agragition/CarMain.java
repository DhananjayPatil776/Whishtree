
package com.agragition;

import java.util.Scanner;

public class CarMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Car Brand Name");
		String c_Brand=sc.next();
		System.out.println("Enter Car Price");
		int price=sc.nextInt();
		System.out.println("Enter Car colour");
		String colour=sc.next();
		
		System.out.println("Enter Insurane Name");
		String iName=sc.next();
		System.out.println("Enter Insurane Number");
		String iNumber=sc.next();
		System.out.println("Enter Insurane Expiry Date");
		String exp_date=sc.next();
		
		Car c=new Car();
		c.setCBrand(c_Brand);
		c.setPrice(price);
		c.setColour(colour);
		
		Insurance i=new Insurance();
		c.setInsurance(i); // Pass i Variable In setInsurance Method
		
		c.getInsurance().setIName(iName);  
		c.getInsurance().setINumber(iNumber);
		c.getInsurance().setExpDate(exp_date);
		
		System.out.println(c.getCBrand());
		System.out.println(c.getPrice());
		System.out.println(c.getColour());
		System.out.println(c.getInsurance().getIName());
		System.out.println(c.getInsurance().getINumber());
		System.out.println(c.getInsurance().getExpDate());
		
				

	}

}
