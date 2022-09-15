package com.array;

// WAP For Reverse The Array
public class ReverseArray_2 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,34,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Backword Array is");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("------------");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
