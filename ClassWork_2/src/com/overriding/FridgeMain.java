package com.overriding;
// WAP Program For Method Overriding And Also Call The Method By Creating The Parent Class Variable 
class Fridge
{
	void cooling()
	{
		System.out.println("Normal Cooling");
	}
}
class Samsung1 extends Fridge
{
	void cooling()
	{
		System.out.println("Samsung Cooling With extra 5 degree celciuse");
	}
}
class Whirlpool extends Fridge
{
	void cooling()
	{
		System.out.println("Whirlpool Cooling With extra 5 degree celciuse");
	}
	void capacity()
	{
		System.out.println("Capacity is 265");
	}
}

public class FridgeMain {

	public static void main(String[] args) {
		
		Fridge f=new Fridge();
		f.cooling();
		
		Samsung1 s=new Samsung1();
		s.cooling();
		
		f=new Samsung1();
		f.cooling();
		
		// Here Called Only Cooling Method with 'f' Variable because f is Parent Variable
		// Capacity Method Does Call With f Variable Bcz Capacity Is Noty Part Of Overriding
		f=new Whirlpool();
		f.cooling();

		

	}

}