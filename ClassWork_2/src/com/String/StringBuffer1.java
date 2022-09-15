package com.String;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello"); // Object And Class NAme Does Not Same
		System.out.println(sb.hashCode());
		sb.append("java");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
	}

}
