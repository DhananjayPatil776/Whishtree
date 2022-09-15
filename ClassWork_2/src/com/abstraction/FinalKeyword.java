

package com.abstraction;

// Final Is Keyword In JAva Used With Variables,Method And Class

// Variable :- We Cannot Modify Its Value.
// Method :- We Can Not Override.
// Class :- We Can not Inherit.

// String class is final In Java.

final class Parent
{
	
}

/*class Child extends Parent  // when Parent Class Is Kept As A Final Class ,Therefore it Is NOt Inherite
{
	
}*/

class Superclass
{
	final void show()
	{
		System.out.println("Super Class Method");
	}
}
class Subclass extends Superclass
{
	//void show()   // Final method Is Not Override
	{
		System.out.println("Sub Class Method");
	}
}

class A
{
	final int a=10;
	void display()
	{
		//a=20;  
		
		System.out.println("dispaly A is : "+a);
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		A a=new A();
		a.display();
		

	}

}
