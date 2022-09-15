package com.array_of_object;

public class Employee1 extends Object  // Object is Super Class Of all Class in java
{
	int id;
	String name;
	int salary;
	
	public Employee1(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary; 
	}
	
	

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ",\n name=" + name + ",\n salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		Employee1 e=new Employee1(1,"Priya",20000);
		System.out.println(e);

		
	}

}
