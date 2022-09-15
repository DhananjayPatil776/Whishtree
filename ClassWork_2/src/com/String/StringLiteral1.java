package com.String;

public class StringLiteral1 {

	public static void main(String[] args) {


		String s="hello";
		String s1="hello";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		String s3=new String("hello");
		
		System.out.println(s3);
		
		if(s==s1) // Equal To Sign Shows Same Equal, Becauze In SCP 's' Store And After That 's1'
			      // Assign So In SCP Chech Charcter And Then Word Come With Refence 
			      // Therefore it Shows Equal And Same Reference Value
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
		
		
		System.out.println("--------------");
		if(s==s3) // Here s in SCP And s3(Created with new Keywork) 
			      // is in Heap So Addres Is Total Different 
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");

		System.out.println("-----------");
		if(s.equalsIgnoreCase(s3)) // Here Compare Actual Character
		{
		System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");

	}

}
