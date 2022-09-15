

package com.abstraction;

abstract class Simple
{
	void show()
	{
		
	}
	abstract void show_features(); // This Is Abstract Method
	                               // For Abstract Method This Particular Class Also REquired Make Abstract
	                              // Abstract Class Does not make Object
}
class Complex extends Simple
{

	@Override  // This Is Called As Covarient
	void show_features() // This Is Abstract Method It Has Rule Is To Define Abstract Method In 
	{
		
		
	}
	
}

public class SimpleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
