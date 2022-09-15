package com.loops;

// Write a Java program to find sum of all even numbers 
  //between 1 to 10
public class SumOfEvenNumber 
{

	public static void main(String[] args) 
	{
		int sum=0;
		System.out.println("Even Number Are : ");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				 sum=sum+i;
			}
			
		}
		System.out.println("Sum Of Even Number IS : "+sum);

	}

}