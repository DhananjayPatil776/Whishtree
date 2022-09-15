package com.inheritance;

public class vehicleMain {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.start();
		c.show();
		c.show_passenger();
		c.stop();
		System.out.println("-------------");
		Auto a=new Auto();
		a.start();
		a.show();
		a.show_passenger();
		a.stop();

	}

}