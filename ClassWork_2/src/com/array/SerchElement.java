package com.array;

// WAP For Find The Element Which Is Enter By User Is Present or Not In array 
import java.util.Scanner;

public class SerchElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		
		System.out.println("Enter Element");
		int a=sc.nextInt();
		int found=0;
		
		for(int i:arr)
		{
			if(i==a)
			{
				found=1;
				break;
			}
		}
		if(found==1)
		{
			System.out.println("Element Is Present In Array");
			
		}
		else
			System.out.println("Element Is Not Present In Array");
		

	}

}
