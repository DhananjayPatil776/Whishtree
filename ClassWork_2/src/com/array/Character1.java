package com.array;

public class Character1 {

	public static void main(String[] args) {
		char a[]= {'a','b','a','z','b','c'};
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			int count=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='\0'; // "\0" This Is Use For Null
				}
			}
			if(a[i]!='\0')
			{
				System.out.println(a[i]+"  is Contain "+count+" Times");
			}
		}
		

	}

}
