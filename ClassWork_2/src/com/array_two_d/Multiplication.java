package com.array_two_d;

public class Multiplication {

	public static void main(String[] args) {
		
		int a[][]= { {1,2},
				     {3,4} };
		
		int b[][]={  {1,4},
	                 {3,2} };
		int c[][]=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<2;k++) 
				{
					c[i][j]=c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
