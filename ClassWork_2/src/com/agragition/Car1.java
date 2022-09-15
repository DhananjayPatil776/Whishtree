

package com.agragition;

public class Car1 
{
	String c_Brand;
	int price;
	
	public Car1(String c_Brand,int price)
	{
		this.c_Brand=c_Brand;
		this.price=price;
	}
	void display()
	{
		// When We not calling to display Method Then Engine Object Also Not Called Means This Is "Tightly coupled"
		// Generly Without Engine CAr HAs No Any Value So This Bonding Is Tightly Coupled
		// So It Called As Cpmposition Containment
		
		Engine e=new Engine();// There is Object Of Engine Is In Display Method 
		                      // bcaz Here Condition Is Firstly Start Engine.
		
		e.start();
		System.out.println("Car Brand Name Is : "+c_Brand);
		System.out.println("Car Price : "+price);
		e.stop();
	}
	

	public static void main(String[] args) {
		Car1 c=new Car1("TATA", 1000000);
		
		c.display();
		

	}

}
