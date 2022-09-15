package com.static_class;

class Building
{
	static String b_name;
	int flat_no;
	char wing;
	int total_no_mem;
	
	public Building(char wing,int flat_no,int total_no_mem) // Parameterised Constructure
	{
		this.wing=wing;
		this.flat_no=flat_no;
		this.total_no_mem=total_no_mem;
		
	}
		
	void display()
	{
		System.out.println("wing "+wing);
		System.out.println("Flat Number "+flat_no);
		System.out.println("Total Number Of Flat "+total_no_mem);
	}
}



public class StaticMain {

	public static void main(String[] args) 
	{
		// This IS Syntax For Static Variable 
		Building.b_name="Shree Residency"; // b_name is A Static Variable, So For Calling It Not
		                                   // Required Object It Called Through Class
		
		System.out.println("** "+Building.b_name+"***");
		
		Building b=new Building('A',102,4);
		b.display();
		System.out.println("__________");
		
		Building.b_name="Sapana Residency";  // We Can Change The Static Variable By Passing Through Address
		System.out.println("*** "+Building.b_name+ "**");
		
		Building b1=new Building('B',205,5);
		b1.display();
		
		System.out.println("__________");
		// Static Variable Change Through By Passing The Address, So Same Name Means Sapana Recidency Print Here
		System.out.println("** "+Building.b_name+ "**");
		
	}

}