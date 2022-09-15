package com.array_two_d;

public class Two_D_Array {

	public static void main(String[] args) {
		int a[][]= { {10,20},   
				     {30,40},
				     {50,60} };    // This Is Initialisation Of 2D Array
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)   // a [for row] [for Cploumn]
			{
				System.out.print(a[i][j]+" ");  // a[i][j]
			}
			System.out.println(" ");
				     
		}

	}

}
