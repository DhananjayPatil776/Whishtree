package com.array_two_d;

public class AdditionOfArray {

	public static void main(String[] args) {
		
		int a[][]= { {2,3},
				     {5,4},
				     {8,5} };
		
		int b[][]= { {4,3},
				     {1,6},
				     {7,4} };
		
		int c[][]=new int [3][2];
				
	//	System.out.println(a.length);
	//	System.out.println(b.length);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
