package com.loops;

  // continue Stetement use for Skip Perticular Itration

public class With_Continue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==7)
			{
				continue;
			}
			System.out.println("i = "+i);
		}

	}

}