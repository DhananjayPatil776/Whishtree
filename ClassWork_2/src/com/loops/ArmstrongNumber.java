package com.loops;

import java.util.Scanner;
//WAP Program For Number Is Armstrong Or Not
public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		int rem=0,prod=0,temp=0;
		temp=num;
		
		//Armstrong Number =
		//Ex 153=(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			prod=prod+(rem*rem*rem);
		}
		if(temp==prod)
		{
			System.out.println("Enetr Number Is Arstrong Number ");
		}
		else
			System.out.println("Enetr Number is Not Arstrong Number ");
		sc.close();
	}

}