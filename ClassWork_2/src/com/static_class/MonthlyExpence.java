package com.static_class;

class Shop
{
	static String shoping_type;
	int item_no;
	float total_expence;
	float monthly_total;
	float sum=0;
	
	Shop(int item_no,float total_expence)
	{
		this.item_no=item_no;
		this.total_expence=total_expence;
	}
	float  expence()
	{
		sum=sum+total_expence;
		return sum;
	}
	void display()
	{
		System.out.println("Total Item No : "+item_no);
		System.out.println("Total Expences In Rs : "+total_expence);
	}
}

public class MonthlyExpence {

	public static void main(String[] args) 
	{
		Shop.shoping_type="Grocery";
		System.out.println("** "+Shop.shoping_type+" ***");
		
		Shop s=new Shop(20,2500.00f);
		s.display();
		System.out.println("---------------------------");
		
		Shop.shoping_type="Dairy";
		System.out.println("** "+Shop.shoping_type+" **");
		
		Shop s1=new Shop(15,2000.00f);
		s1.display();
		System.out.println("---------------------------");
		
		Shop.shoping_type="Medical";
		System.out.println("*** "+Shop.shoping_type+" **");
		
		Shop s2=new Shop(05,350.00f);
		s2.display();
		System.out.println("---------------------------");
		System.out.println("Total Monthaly Expence : "+(s.expence()+s1.expence()+s2.expence()));
	}
}