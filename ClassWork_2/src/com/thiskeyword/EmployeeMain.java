package com.thiskeyword;

public class EmployeeMain 
{
	

	public static void main(String[] args) 
	{
		Employee11 e=new Employee11(101,"Sham",23000);
		Employee11 e1=e.show();
		System.out.println(e1.id+" "+e1.name+" "+e1.salary);
		

	}

}