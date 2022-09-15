package com.overriding;

// WAP For Overloading Of Static Method
class Parent13
{
	static void show()
	{
		System.out.println("Parent Show");
	}
}
class Child13 extends Parent13
{
	static void show()
	{
		System.out.println("Child Show");
	}
}

public class StaticOverriging {

	public static void main(String[] args) {
		
		Parent13 .show();
		
		Child13.show(); // Static Method Can be Overload bcz there Static Keyword
		
		Child13 c=new Child13();
		c.show();

	}

}