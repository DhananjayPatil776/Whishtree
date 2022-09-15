

package com.classmethod;

//create a class person 
//with variables
//person id,person name,age,weight
//write a method  check() to check whether he is eligible to donate blood only if his age is greater than 18 and
//weight is above 50.call this method in main method

public class Person 
{
int p_id=100;
String name="Karan";
int age=25;
float weight=60;

void check()
{
	if(age > 18 && weight > 50)
	{
		System.out.println("Yes... You Are Eligible For Blood Donation ");
	}
	else
	{
		System.out.println("Sorry.... You Are Not Eligible For Blood Donation");
	}
}	

void display()
{
	System.out.println("Person ID IS : "+p_id);
	System.out.println("Person Name Is "+name);
	System.out.println("Person Age IS : "+age);
	System.out.println("Person Weight Is :"+weight);
}

public static void main(String[] args) 
{
	Person p=new Person();
	p.display();
	p.check();


}

}