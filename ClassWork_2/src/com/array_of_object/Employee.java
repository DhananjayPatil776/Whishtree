package com.array_of_object;

import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	int salary;
	Department d;
	
	public Employee(int id,String name,int salary,Department d) 
	{
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
	}
	
	public String toString()
	{
		return id+ name+ salary + d.dname;
	}
	



	public static void main(String[] args) {
		 
		Department d=new Department(1,"I.T.");
		Employee e[]=new Employee[2];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter Employee id");
			int id =sc.nextInt();
			System.out.println("Enter Employe NAme");
			String name=sc.next();
			System.out.println("Enter Salary");
			int salary=sc.nextInt();
			
			e[i]=new Employee(id,name,salary,d);
		}
		for(int i=0;i<2;i++)
		{
			System.out.println(e[i]);
		}

	}

}
