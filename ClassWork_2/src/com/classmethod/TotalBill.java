
package com.classmethod;

import java.util.Scanner;

public class TotalBill 
{
	int q_pizza;
	int q_puffs;
	int q_cd;
	int total;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Pizza Bought : "+q_pizza);
		q_pizza=sc.nextInt();
		System.out.println("Enter The Number Of Puffs Bought : "+q_puffs);
		q_puffs=sc.nextInt();
		System.out.println("Enter The Number Of Coold Drink Bought : "+q_cd);
		q_cd=sc.nextInt();
	}
	
	void calculate()
	{
		total=q_pizza*100 + q_puffs*20 + q_cd*10;
	}
	
	void show()
	{
		System.out.println("Bill Details");
		System.out.println("No of Pizzas : "+q_pizza);
		System.out.println("No of Puffs : "+q_puffs);
		System.out.println("No of Coldrinks : "+q_cd);
		System.out.println("Total Price = "+total);
		
		System.out.println("ENJOY THE SHOW!!!");
	}
	
	public static void main(String[]args)
	{
		TotalBill obj=new TotalBill();
		obj.accept();
		obj.calculate();
		obj.show();
	}

}