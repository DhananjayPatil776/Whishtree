package com.thiskeyword;

public class Employee11 
{
	int id;
	String name;
	float salary;
	
	Employee11(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	Employee11 show()
	{
		//System.out.println("id"+id+name+salary);
		return this;
	}

	

}