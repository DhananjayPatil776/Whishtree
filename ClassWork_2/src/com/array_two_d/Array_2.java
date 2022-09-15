package com.array_two_d;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=sc.nextInt();
		System.out.println("Enter Coloumn");
		int colmn=sc.nextInt();
		
		int a[][]=new int[row][colmn];
		
		System.out.println("Enter The Elemnet Of Array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colmn;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colmn;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
