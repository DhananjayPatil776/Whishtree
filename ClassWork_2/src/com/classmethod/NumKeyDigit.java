

package com.classmethod;

import java.util.Scanner;

public class NumKeyDigit 
{
	int num;
	int key_digit;
	int count=0;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		num=sc.nextInt();
		System.out.println("Enter The Key Digit : ");
		key_digit=sc.nextInt();
	}
	
	void check()
	{
		
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			if(key_digit==rem)
			{
				count++;
			}
		}
		System.out.println(key_digit+" Appeares "+count+" time in "+num);
	}

	public static void main(String[] args) 
	{
		NumKeyDigit obj=new NumKeyDigit();
		obj.accept();
		obj.check();
	

	}

}