package com.ifelse;

public class TypeCasting {

	// Converting Lower Data Type To Higher Data Type Called As Upcasting. It Is Safe in Java
	// Converting Higher Data Type To Lower Data Type Called As Downcasting. It Is not Safe in Java
	// So Casting Is Required.
	public static void main(String[] args) {
		
		// This Is Conevergion Char To Int.
		// Here char Has 2 byte And int has 4 byte.
		// 
		char ch='A';
		int x=ch;
		System.out.println(x);
		System.out.println("---------------");
		
		
		
		int x1=69;
		char ch1=(char) x1;  // Higher Data Type to Lower So Here Char Is Used.
		System.out.println(ch1);
		System.out.println("---------------");
		
		
		
		int x2=10;
		float f2=x2;
		System.out.println(f2);
		System.out.println("---------------");
		
		
		
		float f3=10.34f;
		int x3=(int) f3;
		System.out.println(x3);
		

	}

}