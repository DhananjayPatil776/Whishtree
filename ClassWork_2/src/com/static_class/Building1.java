package com.static_class;

import java.util.Scanner;

public class Building1
{
	static String b_name,b_name1;
	int flat_no;
	char wing;
	int total_no_mem;
	//int parking_no;
	static int parking_no=1000;
	
	static// This Is Static Block
	{
		b_name="Sapana Residency";
		b_name1="Raj Recidency";
		
		System.out.println("** "+b_name1+" ***");
	}
	
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Parking no For Flat no");
//		int parking_no=sc.nextInt();
//		int flat_no=sc.nextInt();
		
		parking_no++; // Parking_no Is Static VAriable ,so
		             // It Increse, When Ti Is Instance Variable Then It 
		              // New Created With New Objec
	}
	
	public Building1(char wing,int total_no_mem,int flat_no)
	{
		this.wing=wing;
		this.total_no_mem=total_no_mem;
		this.flat_no=flat_no;
	}
	
	void display()
	{
		System.out.println("Wing : "+wing);
		System.out.println("Flat Number : "+flat_no);
		System.out.println("Total Number of Member : "+total_no_mem);
		System.out.println("Parking Area : "+parking_no);
	}
	
	static void garden_Area()  // This IS Static Method
	{
		System.out.println("Common To All : "+b_name);
	}

	public static void main(String[] args) 
	{
		garden_Area();
		
		Building1 b=new Building1('A', 4,100);
		b.display();
		System.out.println("--------------------");
		
		Building1 b1=new Building1('B',5,101);
		b1.display();
		System.out.println("--------------------");
		
		System.out.println("*** "+b_name+" ****");
		Building1 b2=new Building1('c',3,102);
		b2.display();
		System.out.println("--------------------");
		
		Building1 b3=new Building1('D',6,104);
		b3.display();
		System.out.println("--------------------");
	
	
	}

}