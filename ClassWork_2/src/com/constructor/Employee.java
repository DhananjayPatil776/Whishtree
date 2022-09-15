package com.constructor;

import java.util.Scanner;

public class Employee 
{
	int id;
	String name;
	float salary;
	
	Employee()
	{
		System.out.println(("Default Constructor"));
		
	}
	Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()  // This Is Also Called As Instance Method
	{
		System.out.println("Employee id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
		System.out.println("------------------");
		this.check();
	}
	void check()
	{
		if(this.name.equals(name))
		{
			System.out.println("Welcome...."+name);
		}
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id..");
		int id=sc.nextInt();
		System.out.println("Enter Name..");
		String name=sc.next();
		System.out.println("Enter Salary..");
		float salary=sc.nextFloat();
		
		Employee e1=new Employee(id,name,salary);
		e1.display();

	}

}