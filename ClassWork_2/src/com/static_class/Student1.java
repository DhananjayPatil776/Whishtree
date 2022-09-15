package com.static_class;

public class Student1 {
	int s_id;
	String s_name;
	static String college_name="MIT";
	
	Student1()
	{
		this(100,"Arjun");
		System.out.println("I Am In Default Constructor");
		System.out.println("Id Is : "+s_id);
		System.out.println("Name Is : "+s_name);
		
		System.out.println("-----------------------");
	
		
	}
	Student1(int s_id,String s_name)
	{
		this(101);
		this.s_id=s_id;
		this.s_name=s_name;
		System.out.println("I Am In Int - String Constructor");
		System.out.println("Id Is : "+s_id);
		System.out.println("Name Is : "+s_name);
		
		System.out.println("-----------------------");
	}
	Student1(int s_id)
	{
		this("Parth");
		this.s_id=s_id;
		
		System.out.println("I Am in Int Constructor");
		System.out.println("Id Is : "+s_id);
		System.out.println("Name Is : "+s_name);
		
		System.out.println("-----------------------");
		
	}
	Student1(String s_name)
	{
		this.s_name=s_name;
		System.out.println("I am In String Constructor");
		System.out.println("Id Is : "+s_id);
		System.out.println("Name Is : "+s_name);
		
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Student1 s=new Student1();

	}

}