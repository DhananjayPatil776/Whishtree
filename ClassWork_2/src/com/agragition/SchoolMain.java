

package com.agragition;

//Student Class Object Variable Agrument Pass In School Variable As A Instance Variable 
//Asign The Value From Main Method And Print From Main Method
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		School s=new School();
		
		
		System.out.println("Enter School Id ");
		int schoolId=sc.nextInt();
		s.setSchoolId(schoolId);
		
		System.out.println("Enter School Name ");
		String schoolName=sc.next();
		s.setSchoolName(schoolName);
		
		System.out.println("Enter School Head Master Name ");
		String hmName=sc.next();
		s.setHmName(hmName);
		
		
		System.out.println("Enter Student Id ");
		int s_id=sc.nextInt();
		System.out.println("Enter Student Name ");
		String s_name=sc.next();
		System.out.println("Enter Student Result ");
		float result=sc.nextFloat();
		
		Student st=new Student();
		s.setStudent(st);  // Here Location Pass Of st in school(s) Object
		
		// This is For Set The Student Value with School Class
		s.getStudent().setSId(s_id);// s.getStudent()
		s.getStudent().setSName(s_name);
		s.getStudent().setResult(result);
		
		System.out.println(s.getSchoolId());
		System.out.println(s.getSchoolName());
		System.out.println(s.getHmName());
		System.out.println(s.getStudent().getSId());
		System.out.println(s.getStudent().getSName());
		System.out.println(s.getStudent().getResult());
		
		
		

	}

}
