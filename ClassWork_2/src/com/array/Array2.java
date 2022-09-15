package com.array;

// WAP For Find Sum Of Element Of Array
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float arr[]=new float[7];
		System.out.println("Enter The Element Of Array");
		float sum=0.0f;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
