package com.superkeyword;

class Parent
{
	int a=10;
}
class Chield extends Parent
{
	int a=20;
	 // Corssor Come Here 
	void show()
	{
		
		System.out.println(super.a);// Corssor goes to Chield's Super Class
		                             // Means parent Class so 'a' call from Parent class
		System.out.println(a);
	}
}

public class SuperAsVariable {

	public static void main(String[] args) {
		
		Chield c=new Chield();
		c.show();

	}

}