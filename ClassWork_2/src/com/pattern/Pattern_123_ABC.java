package com.pattern;
/*
	WAP to draw the following pattern using . Note: Input is an odd number: [1M]*
	12345
	ABCD
	123
	AB
	1
	AB
	123
	ABCD
	12345 */

public class Pattern_123_ABC {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			int count=1;
			for(int j=5;j>=i;j--)
			{
				if(i%2!=0)
				{
					System.out.print(count);
					count++;
				}
				else
				{
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();
			//System.out.println("hii");
		}
		//System.out.println("Hello");
		for(int i=2;i<=5;i++)
		{
			char ch='A';
			int count=1;
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print(count);
					count++;
				}
				else
				{
					System.out.print(ch);
					ch++;
			   }
		    }
			System.out.println();

	    }
	}
}