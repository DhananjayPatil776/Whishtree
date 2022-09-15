package com.superkeyword;


class Parent1
{
	int a=23;
	
	void show()
	{
		System.out.println("A Of Parrent Class "+a);
	}
}
class Chield1 extends Parent1
{
	int a=24;
	void show()
	{
		super.show();
		System.out.println("A Of Chield Class "+a);
	}
}

public class SuperAsMethod 
{

	public static void main(String[] args) 
	{
		Chield1 c=new Chield1();
		c.show();

	}

}