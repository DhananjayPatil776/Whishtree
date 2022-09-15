
	package com.superkeyword;

	import java.util.Scanner;

	class Principal
	{
		String c_name;
		
		Principal()
		{
			c_name="D.Y.Patil";
		}
		void display()
		{
			System.out.println("College Name "+c_name);
			
		}
	}
	class Teacher extends Principal
	{
		String name;
		String subject;
		
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Teacher Name ");
			name=sc.next();
			System.out.println("Enter Teacher Subject");
			subject=sc.next();			
		}
		void display()
		{
			super.display();
			System.out.println("Teacher Name is : "+name);
			System.out.println("Teacher Subject is : "+subject);
		}
	}

	class Student extends Teacher
	{
		char div='A';
		int total_students=27;
		
		void display()
		{
			super.display();
			System.out.println("Division Is...."+div);
			System.out.println("Total Number Of Student...."+total_students);
		}
		
		public static void main(String[] args) 
		{
			Student s=new Student();
			s.accept();
			s.display();

		}

	}


