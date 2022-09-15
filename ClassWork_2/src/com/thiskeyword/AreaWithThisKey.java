package com.thiskeyword;

public class AreaWithThisKey 
{
	// Constructor Using This Keyword
	// Using This KeyWord, We USe Only One Object(Means Less Memory Used).
	// But Drawback Is That The Inner Side Prameter We Can Not Change
	
	// This Method Is Applicable for Bank working means For Finding Rate OF Intrest of Multi User.
	
	AreaWithThisKey()
	{
		this(3.4f); //Automatically Called AreaWithThisKey(float r)
		            // Here Only Use this, '.' not Used
		System.out.println("Default Constructor");
	}
	AreaWithThisKey(float r)
	{
		this(30,20);
		System.out.println("Area Of Circle....."+(3.14*r*r));
	}
	AreaWithThisKey(int l,int b)
	{
		System.out.println("Area Of Rectangle....."+(l*b));
	}

	public static void main(String[] args) 
	{
		
		AreaWithThisKey a=new AreaWithThisKey(); 
		
				

	}

}