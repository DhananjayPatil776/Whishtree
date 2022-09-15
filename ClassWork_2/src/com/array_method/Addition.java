package com.array_method;

//  WAP For Find Sum Of First And LAst Element, 
//  Second First And Secon Last Element Like This.....

public class Addition {

	public void additionElement(int arr[])
	{
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
		{
			System.out.println(arr[i]+arr[j]);
	    }
	}
	public static void main(String[] args) {
		
		int arr[]= {2,5,7,8,9,3};
		Addition a=new Addition();
		a.additionElement(arr);

	}

}
