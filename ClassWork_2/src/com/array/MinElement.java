package com.array;

//WAP To find Minimum Element From Given Array
public class MinElement {

	public static void main(String[] args) {
		
		int arr[]= {1,5,7,23,11};
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Element From Array "+min);

	}

}
