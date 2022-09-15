package com.String;

// Prove String Is Immutable
public class Immutable {

	public static void main(String[] args) {
		
		String s="hello";
		System.out.println(s.hashCode());
		// Following Line Means We Store Value In Other Element
		
		//s=s.concat("world");  // If Comment This Line then hashCode Is Same of 
		                        // line no 9 & 12 
		System.out.println(s.concat("world"));
		System.out.println(s.hashCode());
		System.out.println(s);

	}

}
