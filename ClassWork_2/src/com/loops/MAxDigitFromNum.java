package com.loops;

import java.util.Scanner;

//WAP For Find Maximum Digit From Given Number
public class MAxDigitFromNum 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		int max=num%10;
		num=num/10;
		
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			if(max<rem)
			{
				max=rem;
			}
		}
		System.out.println("Maximum Digit : "+max);
		sc.close();
	}

}