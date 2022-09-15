package com.array;

public class StringComparison {

	public static void main(String[] args) {
		String arr[]= {"hi","how","are","you","doing","has"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length() < arr[j].length())
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else if(arr[i].length()==arr[j].length())
				{
					int k=0;
					if(arr[i].charAt(k)>=arr[j].charAt(k))
					{
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		for(String str:arr)
		{
			System.out.println(str);
		}

	}

}
