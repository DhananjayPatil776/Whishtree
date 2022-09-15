package com.switch_case;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choices For Area Or Perimeter ");
		System.out.println("1. Area Of Circle");
		System.out.println("2. Perimeter Of Circle");
		System.out.println("3. Area Of Square");
		System.out.println("4.Perimeter Of Square");
		System.out.println("5. Area Of Triangle");
		System.out.println("6.Perimeter Of Triangle");
		System.out.println("Enter The Choice ");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Finding Area Of Circule");
			System.out.println("Enter The Radiuse of Circle");
			float r=sc.nextFloat();
			double area=3.14*r*r;
			System.out.println("Area Of Circle Is : "+area);
			break;
		}
		case 2:
		{
			System.out.println("Finding Perimeter Of Circule");
			System.out.println("Enter The Radiuse of Circle");
			float r=sc.nextFloat();
			double peri=2*3.14*r;
			System.out.println("Perimetr Of Circle Is : "+peri);
			break;
		}
		case 3:
		{
			System.out.println("Finding Area Of Square");
			System.out.println("Enter ");
			
		}
		}
		

	}

}