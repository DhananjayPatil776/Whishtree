package com.array;

// WAP To find Maximum Element From Given Array
public class MaxElement {

	public static void main(String[] args) {
		
		int arr[]= {1,5,7,23,11};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Element From Array Is : "+max);
	}

}
