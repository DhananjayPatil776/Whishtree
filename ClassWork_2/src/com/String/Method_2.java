package com.String;

import java.util.Arrays;

public class Method_2 {

	public static void main(String[] args) {
		
		String s="java is programming language";
		System.out.println(s.substring(5)); // This Method Gives Substring Of Given String
		                                   // From Enter Index(5).
		System.out.println("--------------");
		
		System.out.println(s.substring(5, 13));// This Gives Start and End Index
		
		char ch[]=s.toCharArray(); // This Convert String To Array
		
		for(int i=5;i<13;i++) // This With Logic O/p Is Same As Line No 12
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("--------------");
		
		
		int index=5;
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("------------");
		
		String str=Arrays.toString(ch); // This Method Convert Array To String
		System.out.println(str);
		

		
		
		
		
		
		
		
		
		
		
	}

}
