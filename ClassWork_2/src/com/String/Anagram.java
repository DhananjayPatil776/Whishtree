package com.String;

/*Find out given string is anagram or not without using any inbuilt functions
String1="peek";
string2="keep"
o/p :Anagram */

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "peek";
		String s2 = "keep";
		int count=0;
	
		if(s1.length()==s2.length())
		{
			char[]arr1=s1.toLowerCase().toCharArray();
			char[]arr2=s2.toLowerCase().toCharArray();
			char temp;
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=i+1;j<arr1.length;j++)
				{
					if(arr1[j]<arr1[i])
					{
						temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
						
					}
				}
				//System.out.println(arr1[i]);
			}
			
			
//			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for(int i=0,j=0;i<arr1.length && j<arr2.length ;i++,j++)
			{
				
					if(arr1[i]==arr2[j])
					{
						count++;
					}
				
			}
			if(count==arr1.length)
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("String Lenght Is Not Same");

	}

}
