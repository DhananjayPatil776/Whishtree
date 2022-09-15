package com.pattern;
/*  Wap for
	  11
	 1221
	123321
*/
public class Pattern_Assignment 
{

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=3;i++)
		{
			
			for(int sp=3;sp>i;sp--)
			{
				System.out.print(" ");
			}
	
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}


	}
}
