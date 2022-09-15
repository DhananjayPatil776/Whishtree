package com.overriding;

// WAP For Overriding The Method And Call With Parameter.
class Parent22
{
	int i;
	Parent22(int i)
	{
		this.i=i;
	}
	void display()
	{
		System.out.println("Parent I = "+i);
	}
}
class Child22 extends Parent22
{
	int i;
	Child22(int i) 
	{
		super(34);
		this.i=i;
	}
	void display()
	{
		super.display();
		System.out.println("Child1  I = "+i);
	}
	
}
class Child33 extends Parent22
{
	int i;
	Child33(int i)
	{
		super(56);
		this.i=i;
	}
	void display()
	{
		super.display();
		System.out.println("Child2  I = "+i);
	}
	
}


public class ParentChild777 {

	public static void main(String[] args) {
		
		Child22 c1=new Child22(20);
		c1.display();
		
		Child33 c=new Child33(10);
		c.display();

	}

}