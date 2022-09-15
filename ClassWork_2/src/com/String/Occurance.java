package com.String;

import java.util.Scanner;

// WAP To Hide The Given Character 
// ex. String s=java
//  Remove 2nd a
// o/p - jav
public class Occurance {

	public static void main(String[] args) {
       
		String s="jaaavaappe";
		char arr[]=s.toCharArray();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character Wich Is Remove");
		char ch=sc.next().charAt(0);
		
		System.out.println("Enter Occurance");
		int occure=sc.nextInt();
		int count=0;
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
			{
				count++;
				if(count==occure)
					continue;
			}
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
		
		//WAP To Find Last Character From Given String.
		for(int j=i-1;j<arr.length;j++)// This Is For Print Last Character
		{
			System.out.print(arr[j]);
		}
		System.out.println("-------------");
		
		System.out.println(s.indexOf('a'));// Using This Method Find Index 
		                                   // Of Given Character
		
		System.out.println(s.indexOf('p', 2));// This Method Also Shows Index Of Character


	}

}
