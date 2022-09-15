package com.loops;

import java.util.Scanner;

//WAp For Sum Of Any Number And When Enter 0 Then Stop
public class SumOfAnyNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		int sum=0;
		
//		while(num>0)
		//Or
		while(true)
		{
			sum=sum+num;
			num=sc.nextInt();
			if(num==0)
				break;
		}
//		{
//			sum=sum+num;
//			num=sc.nextInt();
//		}
		System.out.println("Sum Is...."+sum);
		sc.close();
	}

}