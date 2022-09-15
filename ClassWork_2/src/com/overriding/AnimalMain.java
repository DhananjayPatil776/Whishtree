package com.overriding;

// WAP for Overriding The Method Of Parent Class Method and Call The Method By 
// Creating Parent Class Variable

class Animal
{
	void sound()
	{
		System.out.println("Sound of Animals");
	}
	void display()
	{
		
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Barking....");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow....");
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		 Animal a;
		 a=new Dog(); // Here Reference Is Same But Object Is Change Means There Use "new" Keyword So 
		              // New Object Creted Only Reference Is Same
		 a.sound();
		 System.out.println(a.hashCode());
		 System.out.println("-----------");
		 
		 a=new Cat();// Here Change In Reference Addres
		 a.sound();
		 System.out.println(a.hashCode());

	}

}