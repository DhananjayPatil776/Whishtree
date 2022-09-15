package com.ifelse;

// Automorphic Number 
// Number =25
//         25 X 25 = 625 
//  Last Dgit Is Same as Number.

import java.util.Scanner;

public class AutomorphicNum 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		
		int squr,fact=0,d=10;
		
		squr=num*num;
		System.out.println("Square Is "+squr);

		while(fact<num)
		{
			fact=squr % d;
			d=d*10;
		}
		
		if(fact==num)
		{
			System.out.println("Enter Number Is Automorphic");
		}
		else
			System.out.println("Enter Number Is Not Aotumorphic");
		sc.close();
	}

}