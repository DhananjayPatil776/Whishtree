package com.String;

public class StringBuffer11 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.capacity());
		sb.append("java programming language");
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		sb.append("string buffer ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
