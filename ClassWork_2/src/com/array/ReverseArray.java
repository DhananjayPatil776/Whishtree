package com.array;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,23,5,2,23,11};
		int arr[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				arr[j]=a[i];
			}
		}
		System.out.println("Array In Reverse Order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
