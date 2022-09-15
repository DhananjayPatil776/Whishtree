package com.String;

public class StringLiteral {

	public static void main(String[] args) {
		
		String s1="hello"; // s1 And s2 Store in String Constant Pool (SCP).
		                   // in SCP It Compaire With String Not With Address
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("Hello");
		
	
		
		if(s1==s2) // Here s1==s3 Answer Is Not Equal Bcz s3 Is Created By new Keyword
			         // Which Store In Heap With Different Address
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}

		if(s1.equalsIgnoreCase(s4))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}
