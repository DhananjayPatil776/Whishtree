package com.nestedloop;

import java.util.Scanner;

//WAP For Armastrong Number From Given Range
public class ArmastrongNumFromRange 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number From Range");
		int num=sc.nextInt();
		System.out.println("Enter 2nd Number From Range ");
		int num2=sc.nextInt();
		int rem=0,prod=0;
		
		
		for(int i=num;i<=num2;i++)
		{
			System.out.println(i);
			int temp=0;
			temp=i;
			System.out.println("Temp "+temp);
			while(i<=num2)
			{
			
				rem=i%10;
				i=i/10;
				prod=prod+(rem*rem*rem);
				
			}
			if(temp==prod)
			{
				System.out.println("Hii");
				System.out.print(temp+" ,");
			}
			
		}

	}

}