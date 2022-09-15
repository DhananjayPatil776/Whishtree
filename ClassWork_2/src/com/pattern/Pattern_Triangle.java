package com.pattern;

import java.util.Scanner;
//  Pattern 
//        *              
//       *** 
//      ***** s
//     ******* 
//    *********



public class Pattern_Triangle 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int sp=row-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}