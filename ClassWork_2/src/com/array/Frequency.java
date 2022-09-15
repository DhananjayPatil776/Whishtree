package com.array;

public class Frequency 
{

	public static void main(String[] args) 
	{
		int arr[]= {-1,2,5,3,-1,3,5,-1,5,5,3,2};
		
		boolean visited;
		
		for(int i=0;i<arr.length;i++)
		{
			
			visited=false;
			int count=1;
			for(int j=i-1;j>=0;j--)   // This Loop Is For going to Back Of Current Position
			{
			   if(arr[i]==arr[j])
				{
					visited=true;
					break;
				}
			
			}
			if(visited==false)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
						count++;
					}
				}
			}
		
			if(count>1)
			{
				 System.out.println(arr[i]+" is "+count+" Times");
			}
		}

	}

}
