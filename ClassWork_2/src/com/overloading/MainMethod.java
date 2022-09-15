package com.overloading;

//Main Method Overload With Different Parameter But Call By JVM Which Is Known Means "String[] arg" Argument

public class MainMethod {

	public static void main(String[] args) 
	{
	System.out.println("Min With String[]");
	}
	
	public static void main(String args) 
	{
	System.out.println("Main With String");
	}
	public static void main(int x) 
	{
		System.out.println("Main With int");
	}
	

}