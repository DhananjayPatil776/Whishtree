

package com.classmethod;

//create class airlines
//with variables
//airlinename,citytoboard,citytoreach,fare
//create a method show() to display all the details

public class Airlines 
{
	String name="Indigo";
	String c_board="Pune";
	String c_reach="Delhi";
	float fare=4000.00f;
	
	void show()
	{
		System.out.println("Welcome To "+name+" Airline");
		System.out.println("Your Boarding City Is : "+c_board);
		System.out.println("Your Destination City Is : "+c_reach);
		System.out.println("Your Total Fare IS : "+fare);
	}

	public static void main(String[] args) 
	{
		Airlines a=new Airlines();
		
		a.show();

	}

}