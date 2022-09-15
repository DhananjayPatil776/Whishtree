package com.pattern;
//  Pattern 

//      *
//     ***
//    *****
//   *******
//  *********
//   *******
//    *****
//     ***
//      *

public class Pattern_Diamond
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=4;i>=1;i--)  // Here Given i=4 Because There Required Only One Line
			                       // (At Large Line)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
			
	}

}