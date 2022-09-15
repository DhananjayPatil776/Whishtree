package com.thiskeyword;

class A
{
	int id;
	String name;
	float sal;
	ThisAsConstructor t;
	
	A(ThisAsConstructor a)
	{
		System.out.println(a.data);
	}
	
}
public class ThisAsConstructor 
{
	int data=20;
	
	ThisAsConstructor ()
	{
		A a=new A(this);//
	}

	public static void main(String[] args)
	{
		ThisAsConstructor  t=new ThisAsConstructor(); 

	}

}