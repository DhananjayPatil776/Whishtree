package com.String;

public class Intern1 {

	public static void main(String[] args) {
		String s="Ram";
		
		String s1=new String("Ramesh"); 
		
		String s3=s1.intern();
		if(s==s3)
		{
			System.out.println("User Name Is Valid");
		}
		else
		{
			System.out.println("Not Equal");
		}

	}

}
