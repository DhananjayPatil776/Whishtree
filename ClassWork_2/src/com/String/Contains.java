package com.String;

public class Contains {

	public static void main(String[] args) {
		
		String s="hello";
		boolean b=s.contains("l"); // This Method Is Use For Find The Given Chrcter
		                            // Is Present Or Not In Given String.
		
		if(b==true)
		{
			System.out.println("Given String is Present ");
		}
		else
		{
			System.out.println("Given String Is Not Present");
		}
		System.out.println("--------------");

		System.out.println(s.endsWith("lo")); // This Method is Gives End Of String
		System.out.println("--------------");
		
		System.out.println(s.startsWith("he"));
		System.out.println("--------------");
		
		System.out.println(s.startsWith("llo", 2));// This Method Gives String And Starting Index 
		                                           // In the Form Of True/False
		System.out.println("--------------");
		
		System.out.println(s.toUpperCase());
		System.out.println("--------------");
		System.out.println(s.toLowerCase());
	}

}
