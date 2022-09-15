package com.inheritance;

public class Vehicle 
{
	String vName;
	int speed;
	String color;
	
	void start()
	{
		System.out.println("Vehicle is Getting Strted");
	}
	void stop()
	{
		System.out.println("Vehicle Is Getting Stopped");
	
	}
}

class Car extends Vehicle
{
	String vName="Car";
	int speed = 80;
	String color="blue";
	
	void show()
	{
		System.out.println("Name is : "+vName);
		System.out.println("Speed Is : "+speed);
		System.out.println("Colour is : "+color);
	}
	void show_passenger()
	{
		System.out.println("5 Passenger Are Allowed");
		
	}
}

class Auto extends Vehicle
{
	String vName="Auto";
	int speed=60;
	String color="black_Yellow";
	
	void show()
	{
		System.out.println("Name is : "+vName);
		System.out.println("Speed is : "+speed);
		System.out.println("Color is : "+color);
	}
	void show_passenger()
	{
		System.out.println("3 Passenger Are Allowed");
		
	}
}