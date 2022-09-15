package com.ifelse;

import java.util.Scanner;

// How To Prove Enter Thing Is Integer/Float/String.
public class NumberTypeProof 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Or String");
		boolean flag1=sc.hasNextInt();
		boolean flag2=sc.hasNextDouble();
		boolean flag3=sc.hasNext();
		
		//When Enter Special Character Then It Consider As A String.
		//Integer Number Also Some Time Consider As A String.
		
		if(flag1==true)
		{
			System.out.println("It Is a Integer ");
		}
		else if(flag2==true)
		{
			System.out.println("It Is A Double ");
		}
		else if(flag3==true)
		{
			System.out.println("It Is String ");
		}
		else
			System.out.println("Invalid ");
		sc.close();
	}

}