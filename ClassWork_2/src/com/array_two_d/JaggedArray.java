package com.array_two_d;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][]=new int [3][];
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		System.out.println("Enter Element Of 1st Row");
		for(i=0;i<1;i++)
		{
			for(j=0;j<1;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Element Of 2nd Row");
		for(i=1;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Element Of 3rd Row");
		for(i=2;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array Element is ");
		System.out.print("{ ");
		for(i=0;i<1;i++)
		{
			System.out.print("{ ");
			for(j=0;j<1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("},");
			System.out.println();
		}
		
		for(i=1;i<2;i++)
		{
			System.out.print("{ ");
			for(j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("},");
			System.out.println();	
		}
		
		for(i=2;i<3;i++)
		{
			System.out.print("{ ");
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("},");
			//System.out.println();	
		}
		System.out.print(" }");

	}

}











