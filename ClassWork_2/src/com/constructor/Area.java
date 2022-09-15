package com.constructor;

public class Area 
{
	// This Program IS CAlled Constructor Overloading 
	//  
	
	Area()
	{
		System.out.println("Default Constructor");
	}
	Area(float r)
	{
		System.out.println("Area Of Circle IS ....."+(3.14*r*r));
	}
	Area(int l,int b)
	{
		System.out.println("Area Of Rectangule....."+(l*b));
	}

	public static void main(String[] args) 
	{
		Area a=new Area();  // This Object For Default Constructor
		Area a1=new Area(3.2f);  // This Object For CAlling Area(Flot r) Parameterised Constructor
		
		// Following Sysntax Also Use For Creating Object 
		new Area(12,10);  // This Also Same As Above

	}

}