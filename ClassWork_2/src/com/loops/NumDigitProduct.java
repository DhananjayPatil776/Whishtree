package com.loops;

import java.util.Scanner;

//Write a Java program to calculate product of digits of any number.
public class NumDigitProduct 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		int prod=1,fact;
		
		for(int i=num;i>0;i=i/10)
		{
			fact=i%10;
			prod=prod*fact;
		}
		System.out.println("Product Of Digit Of Number iS : "+prod);
		sc.close();
	}

}