package com.String;



public class CharacterToArray {

	public static void main(String[] args) {
		
		String s="hello";
		
		char s1[]= {'a','b','c'};
		System.out.println(s1);// Here Print Character Array
		
		char ch=s.charAt(3); // charAt() Geves Position Character  Of Character From String 
		System.out.println(ch);
		
		System.out.println("------------");
		int count =0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==3)
			{
				c[i]=(char) (c[i]-32);
			}
			System.out.println(c[i]);
		}
		for(int i=0;i<c.length;i++)
		{
			count++;
		}
		System.out.println(("---------------"));
		System.out.println(count);
		System.out.println(s.length());

	}

}
