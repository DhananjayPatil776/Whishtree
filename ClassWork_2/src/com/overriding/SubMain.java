package com.overriding;

//   MethodOverriding:- Same Name sameParameter Same Return Type.

class Mob
{
	void backCamera()
	{
		System.out.println("Camera");
	}
}
class Samsung extends Mob
{
	void backCamera()
	{
		System.out.println("Camera with 12 mpx");
	}
	void frontCamera()
	{
		System.out.println("Front Camera ");
	}
}


public class SubMain {

	public static void main(String[] args) {
		
		Samsung s=new Samsung();// Here Samsung class Object Ceated therefor smung Class have 
		                        // also backcamra methd, sotis chld cla method called
		             
		s.backCamera();
		s.frontCamera();

	}

}