

package com.classmethod;

import java.util.Scanner;

public class Book 
{
	int b_id;
	String b_name;
	String author_name;
	float price;
	
	Book()   // CAlled As Constructor
	{
		
		System.out.println("Constructor Of Book Class");
		System.out.println("-------------------------");
	}
	
	void accept(int id,String b_n,String a_name,float p)
	{
		b_id=id;
		b_name=b_n;
		author_name=a_name;
		price=p;
	}
	void show()
	{
		System.out.println("Book Id Is : "+b_id);
		System.out.println("Book Name Is : "+b_name);
		System.out.println("Book Author Name is : "+author_name);	
		System.out.println("-----------------------------");
	}
	void givenrating()
	{
		System.out.println("Give Rating To The Book");
		System.out.println("1.Excellent , 2.Good , 3.Average , 4.Bad ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Rating Given By Reader");
	
		switch(ch)
		{
		case 1:{
			System.out.println("Excellent");
			break;
			
		}
		case 2:{
			System.out.println("Good");
			break;
		}
		case 3:{
			System.out.println("Average");
			break;
		}
		case 4:{
			System.out.println("Bad");
			break;
		}
		}
	}
                    
	public static void main(String[] args) 
	{
		
		
		Book b=new Book();
		b.accept(100,"Half Girlfrind", "Chetan Baghat",300.00f);
		b.show();
		b.givenrating();

	}

}