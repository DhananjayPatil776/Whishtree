package com.overriding;

// WAP For Call The Parrent Class Method Using Super Keyword
class Parent
{
	void show(int x)
	{
		System.out.println("Parent X = "+x);
	}
}
class Child1 extends Parent
{
	void show(int x)
	{
		super.show(10);
		System.out.println("Child1 X = "+x);
	}
}
class Child2 extends Parent
{
	void show(int x)
	{
		super.show(50);
		System.out.println("Child2 X = "+x);
	}
}

public class ParentChild {

	public static void main(String[] args) {
		
//		Child1 c1=new Child1();
//		c1.show(100);
//		
//		Child2 c2=new Child2();
//		c2.show(23);
		
		Parent p;
		p=new Child1();
	// OR
		    // Line no 37,38 & 41 is same becauze Chield on is Part(Subclass) Of Parent 
	//	Parent p=new Child1();
	
	//	p.show(30);
		
		p=new Child2();
		p.show(20);
		

	}

}