package com.superkeyword;

// Every Class Has A Super Class Whis Is Object Class 
// This Object Clss Is Default

class Person
{
	int id;
	String name;
	String organization;
	String gender;
	
	public Person(int id,String name,String organization,String gender)
	{
		this.id=id;
		this.name=name;
		this.organization=organization;
		this.gender=gender;
	}

	void display()
	{
		System.out.println("I Am In Person Display");
		System.out.println("Id Is : "+id);
		System.out.println("Name Is : "+name);
		System.out.println("Organization Is : "+organization);
		System.out.println("Gender Is : "+gender);
		System.out.println("----------------");
	}

}

class Employee extends Person
{
	int id;
	String name;
	String organization;
	String gender;
	
	public Employee(int id, String name, String organization, String gender) 
	{
		super(id, name, organization, gender);
		this.id=id;
		this.name=name;
		this.organization=organization;
		this.gender=gender;
	}
	
	void display()
	{
		System.out.println("I Am In Employee Display");
		System.out.println("Id Is : "+id);
		System.out.println("Name Is : "+name);
		System.out.println("Organization Is : "+organization);
		System.out.println("Gender Is : "+gender);
		System.out.println("----------------");
	}
}
class Worker extends Employee
{
	int id;
	String name;
	String organization;
	String gender;
	
	public Worker(int id, String name, String organization, String gender) {
		super(111, "Sanju","I.T.", "Male");
		//super(id, name, organization, gender);
		this.id=id;
		this.name=name;
		this.organization=organization;
		this.gender=gender;
	}
		void display()
		{
			// Here Happening Ambiguty So Only Worker's Method called(bcz Worker's Object Created)
			// There For We Use Super Keyword For Calling Method Os Parent Class.
			super.display();
			System.out.println("I Am In Worker Display");
			System.out.println("Id Is : "+id);
			System.out.println("Name Is : "+name);
			System.out.println("Organization Is : "+organization);
			System.out.println("Gender Is : "+gender);
			System.out.println("----------------");
		}
	
}

public class SuperAsConstructor {

	public static void main(String[] args) {
		
		Worker w=new Worker(222, "Raju", "Worker", "Male");
		w.display();

	}

}