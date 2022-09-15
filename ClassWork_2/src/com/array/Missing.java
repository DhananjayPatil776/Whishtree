package com.array;

public class Missing {

	public static void main(String[] args) {
		
		int arr[]= {5,3,1,2,6,4,8};
		
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		
		System.out.println(sum);
		int sum1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println(sum1);
		int missing=sum-sum1;
		System.out.println("Missing Number is..."+missing);

	}

}
