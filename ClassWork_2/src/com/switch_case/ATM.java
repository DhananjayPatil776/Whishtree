package com.switch_case;

import java.util.Scanner;

public class ATM 
{

	public static void main(String[] args) 
	{
		int balance=1000,choice;
		int withdraw,deposite;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Minimum Balance ");
		//int minbalance=sc.nextInt();
		balance=balance-500;
		do
		{
			System.out.println("Choises Are ");
		System.out.println("1.Withdraw");
		System.out.println("2.Diposite");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		System.out.println("-----------------------");
		System.out.println("Enter The Choice ");
		
		choice=sc.nextInt();
		System.out.println("-----------------------");
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter The Mony In 50,100,500,1000 Form : ");
			withdraw=sc.nextInt();
			if(withdraw<balance)
			{
				balance=balance-withdraw;
				System.out.println("Your Current Balance Is : "+balance);
				System.out.println("-----------------------");
			}
			else
			{
				System.out.println("You Have Insufficient Balance ");
				System.out.println("-----------------------");
			}
			break;
		}
		case 2:
		{
			System.out.println("Deposite Mony ");
			deposite=sc.nextInt();
			balance=balance + deposite;
			System.out.println("Your Current Balance Is : "+balance);
			System.out.println("-----------------------");
			break;
			
		}
		case 3:
		{
			System.out.println("Your Current Balance Is : "+balance);
			System.out.println("-----------------------");
			break;
		}
		case 4 :
			System.out.println("Thank You For Visiting The ATM ");
			System.out.println("Exit ");
			
			System.exit(0);
		
		}
		}
		while(true);
		
	
	}

}