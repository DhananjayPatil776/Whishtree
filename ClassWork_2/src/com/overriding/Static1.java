package com.overriding;

class Parent77
{
	static void display()
	{
		System.out.println("Parent Method");
	}
}
class Child extends Parent77
{
	static void display()
	{
		System.out.println("Child Method");
	}
}

public class Static1 {

	public static void main(String[] args) {
		
		Parent77 p=new  Child(); 
		p.display(); // Static Method Can Not Override 
		             // Why Not Override , Static method call By Name No Need To Object

	}

}
