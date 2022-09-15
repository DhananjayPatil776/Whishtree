package com.loops;

import java.util.Scanner;

//WAp For Find Number Is Prime Or Not. 
public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<=num/2;i++) // i<=num/2 because of reduce the itration 
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(num+" ...Number Is Not Prime");
		}
		else
		{
			System.out.println(num+" ...Number Is Prime ");
		}
	}

}