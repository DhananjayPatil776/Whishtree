package com.String;

// WAP For Array To String, Find Perticular Position Characte 
// And Covert Small Case To Upper Case and Find String Length.
public class Method {

	public static void main(String[] args) {
		
		String s="helyo";
		
		char s1[]= {'a','b','c'};
		System.out.println(s1);
		System.out.println("------------");
		
		char ch=s.charAt(3);
		System.out.println(ch);
		System.out.println("------------");
		
		int count=0;
		
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==3)
			{
				c[i]=(char) (c[i]-32);
			}
			System.out.println(c[i]);
			
		}
		System.out.println("------------");
		
		for(int i=0;i<c.length;i++)
		{
			count++;
		}
		System.out.println(count);
		System.out.println(s.length());
	}

}
