

package com.loops;

//WAP to print even numbers from 121 to 229 using for loop.
public class EvenNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Even Number From Given Range Is : ");
		for(int i=121;i<=229;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}