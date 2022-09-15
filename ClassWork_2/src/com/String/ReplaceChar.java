package com.String;

public class ReplaceChar {

	public static void main(String[] args) {
		
		String s= "abc@gmail.com,abc@hotmail.com";
		System.out.println(s.replace('l', 'v'));
		System.out.println("------------------");
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='l')
			{
				ch[i]='v';
			}
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("------------------");
		
		System.out.println(s.replace("mail", "abcd"));
		System.out.println("------------------");
		System.out.println(s.replaceAll("@","@@"));// In Replace All, There Is Replace 
		                                          // regex(Special Character)
		System.out.println("------------------");
		System.out.println(s.replaceFirst("@","@@@")); // In This Method Replace Only First

	}

}
