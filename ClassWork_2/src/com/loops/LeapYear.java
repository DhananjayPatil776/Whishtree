package com.loops;

import java.util.Scanner;

//Write a Java program to check whether a year is leap year or not
public class LeapYear 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Year Which Is Find Leap Or Not");
		int year=sc.nextInt();
		
		if((year%4==0 && year%100!=0)||(year %400 ==0))
		
		{
			System.out.println(year +" Year Is Leap Year ");
		}
		else
			System.out.println(year+" is Not Leap Year");
		sc.close();

	}

}