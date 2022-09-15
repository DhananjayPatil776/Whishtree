package com.array;

// WAP For Insert The Given Value at Given Position in Array With All Array Element
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size+1];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Index Where you Want Enter Element in Array");
		int index=sc.nextInt();
		System.out.println("Enter The Value Which Is Insrted");
		int new_value=sc.nextInt();
		
		for(int i=size-1;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=new_value;
		System.out.println("Array With Inserted Value is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
