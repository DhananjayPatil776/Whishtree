package com.overriding;

// WAP For Downcasting Inheritance
class Flower
{
	void show()
	{
		System.out.println("Flower Class");
		
	}
}
class Rose extends Flower
{
	void show()
	{
		System.out.println("Rose Class");
	}
	void display()
	{
		System.out.println("Rose Display Method");
	}
}
public class DownCasting {

	public static void main(String[] args) {
		
		Flower f=new Rose();// This Is Down Casting
		Rose r = (Rose) f;
		r.display();
		r.show();
		
	}

}