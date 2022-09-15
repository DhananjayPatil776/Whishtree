package com.array;

import java.util.Scanner;

public class DeletElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,50};
		System.out.println("Enter Index");
		int index=sc.nextInt();
		
		int size=a.length;
		for(int i=index;i<size-1;i++)
		{
			a[i]=a[i+1];
			//System.out.println(a[i]);
		}
		System.out.println("Array With Deleted Element ");
		for(int i=0;i<size-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
