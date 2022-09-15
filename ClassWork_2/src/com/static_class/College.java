package com.static_class;

import java.util.Scanner;

class Student
{
	private int s_id;
	private String s_name;
	static String college_name="MIT";
	
	public void sets_id(int s_id)
	{
		this.s_id=s_id;
	}
	public int gets_id()
	{
		return s_id;
	}
	public void sets_name(String s_name)
	{
		this.s_name=s_name;
	}
	public String gets_name()
	{
		return s_name;
	}
}

public class College 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Student Id ");
		int s_id=sc.nextInt();
		System.out.println("Enter The Student Name ");
		String s_name=sc.next();
		
		System.out.println("College Name Is : "+Student.college_name);
		Student s=new Student();
		s.sets_id(s_id);
		s.sets_name(s_name);
		
		System.out.println(s.gets_id());
		System.out.println(s.gets_name());

	}

}