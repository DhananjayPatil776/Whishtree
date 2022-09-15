package com.loops;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		int rev=0;

		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;  //. This Is Standard Logic For Reverse
			num=num/10;
		}
		System.out.print(rev);
    sc.close();
	}

}