
package com.abstraction;


abstract class Television
{
	private int ic_number=1234;
	static final int size=50;
	
	Television()  // How To Call Abstract Class Constructor :- Making Object Reference 
	                //Of Abstract Class using Child Class.
	              
	{
		System.out.println("Television Details");
	}
	void show()
	{
		System.out.println("Showing Television Details");
	}
	
	abstract public void specific_Implement();
}

class Sony extends Television
{
	Sony(String str)
	{
		
	}

	@Override
	public void specific_Implement() {
		System.out.println("Brand Name Is Sony");
		System.out.println("Screen 12*12");
		System.out.println("Android");
		
	}
	
}

public class AbstractMain {

	public static void main(String[] args) {
		
		Television t=new Sony("Sony");// Firstly Call Television Constructor Then MEthod
		t.show();
		t.specific_Implement();

	}

}

