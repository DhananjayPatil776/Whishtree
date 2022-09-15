package com.loops;

// WAP For, Suppose After Every 3 Chocolate,1 Chocolate Increse, 
//So Find Total Chocolate From Given Number Of Chocolate 

import java.util.Scanner;

public class Assignment_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of Chocolate");
		int choco=sc.nextInt();
		int count=0;
	
		for(int i=1;i<=choco;i++)
		{
			if(i%3==0)
			{
				choco=choco+1;
				count++;
				//System.out.println("choco Is :"+choco);
			}
		}
		System.out.println("Total Chocolate After Scheme : "+choco);
		System.out.println("Total Increse Chocolate By : "+count);
		
		sc.close();
	}

}