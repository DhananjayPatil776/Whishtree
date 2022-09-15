package com.loops;

import java.util.Scanner;

//WAP For Palindrome Number 
public class PalindromNum 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		int rem=0,rev=0;
		int temp=num;
		
		// Enter Number And Its REverse Is Same Ex 12321
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10 + rem;	
		}
		System.out.print("Reverse Number Is : "+rev);
		System.out.println();
		
		if(temp==rev)
		{
			System.out.println("Entered Number Is Palindrom");
		}
		else
			System.out.println("Entered Number Is Not Palindrom");
		sc.close();
	}
}