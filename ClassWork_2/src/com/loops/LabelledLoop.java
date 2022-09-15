package com.loops;

public class LabelledLoop 
{

	public static void main(String[] args) 
	{
loop1:for(int i=0;i<10;i++)
		{
loop2:	 for(int j=0;j<i;j++)
			{
				if(i%2==0)
				{
					continue loop1 ;
				}
				else
					System.out.print(" * ");
			}
	System.out.println();
		}
		

	}

}