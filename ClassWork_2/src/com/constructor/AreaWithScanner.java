package com.constructor;

import java.util.Scanner;

public class AreaWithScanner 
{
	int a,b;
	
	AreaWithScanner()
	{
		System.out.println("Default Constructor");
		
	}
	AreaWithScanner(float r)
	{
		this(12,23);
		System.out.println("Area Of Circle..."+(3.14*r*r));
	}
	AreaWithScanner(int l,int b) 
	{
		System.out.println("Area Of Rectangule...."+(l*b));
	}

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		AreaWithScanner a1=new AreaWithScanner (3.2f);

	}

}