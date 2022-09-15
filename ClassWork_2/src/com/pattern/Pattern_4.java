package com.pattern;

//WAP For Pattern 
	//  * * * 
	//    * *
	//      *
public class Pattern_4 
{

	public static void main(String[] args) 
	{
		System.out.println("hello");
		for(int i=1;i<=5;i++)
		{
			System.out.println("hii");
			for(int sp=1;sp<=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=1;j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}