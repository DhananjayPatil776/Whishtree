

package com.classmethod;

import java.util.Scanner;

//create class theatre with variables 
//theatre_name,movie_name,ticket_price,coupon
//create a method calculatePrice() which display if he has coupon as gold he vl get 10% discount
//on ticket price if he has platinum he vl get 7% disvount and if he has silver 5% discount.and if he 
//does not have coupon no discount.Display entire details with ticket fare.

public class Theater
{
		
	String t_name="City Pride";
	String m_name="3 Idiots";
	double price=400;
	//String coupon="Gold";
	
	void calculate(String coupon)
	{
		switch(coupon)
		{
		case "Gold":
		{
			double discount= (price*0.1);
		//	System.out.println(discount);
			price=price-discount;
			break;
			
		}
		case "Platinum":
		{
			double discount= (price*0.07);
			price=price-discount;
			break;
		}
		case "Silver":
		{
			double discount= (price*0.05);
			price=price-discount;
			break;
		}
		}
		
	}
	
	void show()
	{
		System.out.println("Price Of Movie Ticket Is : "+price);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Coupon : Gold , Platinum , Silver");
		String coupon=sc.next();
		
		
		Theater t=new Theater();
		t.calculate(coupon);
		t.show();

	}

}