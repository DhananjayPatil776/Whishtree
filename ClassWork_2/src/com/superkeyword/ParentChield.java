package com.superkeyword;

class Parent22
{
	int i;
	
	Parent22(int i)
	{
		this.i=i;
	}
	void display()
	{
		System.out.println("i With Parrent Class "+i);
	}
}
class Child extends Parent22
{
	int i;

	Child(int i)
	{
		super(34);
		this.i=i;
	}
	void display()
	{
		super.display();
		System.out.println("i With Child Class "+i);
	}
	
}
class Beby extends Child
{
	int i;

	Beby(int i) 
	{
		super(56);
		this.i=i;
		
	}
	void display()
	{
		super.display();
		System.out.println("i With Beby Class "+i);
	}
	
}


public class ParentChield {

	public static void main(String[] args) 
	{
		Beby b=new Beby(10);
		b.display();
		

	}

}