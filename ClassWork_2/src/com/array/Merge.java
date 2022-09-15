package com.array;

// WAP For Merge Two Array In Single Array
public class Merge {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7};
		
		int length=arr1.length+arr2.length; 
		int arr3[]=new int[length];
		
		int i;
		for( i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		// Here I=4 Bcz arr1.length is 4 but condition is i<arr1.length
		
		for(int j=i,k=0;j<arr3.length && k<arr2.length;j++,k++)
		{
			arr3[j]=arr2[k];
		}
		for(i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}

	}

}
