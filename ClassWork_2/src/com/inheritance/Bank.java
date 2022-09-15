package com.inheritance;

public class Bank 
{
	String bName;
	
	public double intrest(int intr)
	{
		return intr;
	}

}

class ICICI extends Bank  // Single Type Inheritance 
{
	double intrest(double intr)
	{
		return intr;
	}
	String bName="ICICI"; // One Parrent Class It Has More Than One Chield Class Called 
	                      // as Herarchical Inheritance.
}
class SBI extends Bank
{
	String bName="SBI";
}