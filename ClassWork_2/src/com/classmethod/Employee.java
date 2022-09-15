

package com.classmethod;

public class Employee 
{
	int e_id=100;            // These Are ISntance VAriable Which Is Inside The
	String name="Arjun";      //  Class And Outside The Method
	float salary=30000;
	
	void claculate()
	{
		float bonus=5000;    // Here Bonus Is Local VAriable Because Of Initialise Inside The Method Block
		salary=salary+bonus;
	}
	
	void display()
	{
		System.out.println("Employuee Name Is : "+name);
		System.out.println("Employee ID Is : "+e_id);
		System.out.println("Employee Salary Is : "+salary);
	}

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.claculate();
		e.display();
		System.out.println("----------------");
		
		System.out.println(e.name);  //Call the Instance Variable Using Object
		System.out.println(e.salary);
		System.out.println("-------------");
		
		e.salary=40000;  // Directly Increse The Salary
		e.claculate();
		e.display();

	}

}