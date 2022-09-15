package com.array;

import java.util.Scanner;

public class RotateElement {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element You Want To Rotate up to 5");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int  last=arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("Array After Rotate");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
