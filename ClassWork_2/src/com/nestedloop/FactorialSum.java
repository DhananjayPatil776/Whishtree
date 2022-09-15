package com.nestedloop;

// Find S= 1!+2!+3!........+n!
import java.util.Scanner;

public class FactorialSum 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Up T You Want Factor");
		int n=sc.nextInt();
		
		int fact,prod=1,sum=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j=j/10)
			{
				fact=j%10;
				prod=prod*fact;
				sum=sum+prod;
				
			}
		}
		System.out.println("S = "+sum);
		sc.close();

	}

}