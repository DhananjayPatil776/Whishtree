package com.array_of_object;

import java.util.Scanner;

public class EmployeeSimple {

	int id;
	String name;
	int salary;
	
	public EmployeeSimple(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+name+salary;
	}
	
	public static void main(String[] args) {
		
		EmployeeSimple e[]=new EmployeeSimple[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Salary");
			int salary=sc.nextInt();
			
			e[i]=new EmployeeSimple(id,name,salary);
			//System.out.println(e[i]);  // This Showing Hashcode
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(e[i]);
		}
		

	}

}
