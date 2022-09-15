package com.array;

// WAP For sum of Even Number From Array
public class SumOfEvenNum {

	public static void main(String[] args) {
		int arr[]= {11,2,12,9,4,3,6};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum Of Even Number "+sum);

	}

}
