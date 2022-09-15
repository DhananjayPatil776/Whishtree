package com.inheritance;

public class BankMain {

	public static void main(String[] args) {
		ICICI i=new ICICI();
		SBI s=new SBI();
		
		System.out.println(i.bName);
		System.out.println(i.intrest(4.5));
		System.out.println(s.bName);
		System.out.println(s.intrest(5));

	}

}