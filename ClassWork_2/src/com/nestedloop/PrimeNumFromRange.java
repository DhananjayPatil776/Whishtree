package com.nestedloop;
import java.util.Scanner;

// WAp For Find Prime Number From Given Range

public class PrimeNumFromRange 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number From Range");
	int num1=sc.nextInt();
	System.out.println("Enter End Number From Range");
	int num2=sc.nextInt();
	System.out.println("Prime Number From "+num1+" To "+num2);
	
	for(int i=num1;i<=num2;i++)
	{
		int flag=0;
		
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(i);
		}
	}
	sc.close();
	}

}