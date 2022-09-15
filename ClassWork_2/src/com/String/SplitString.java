package com.String;

public class SplitString {

	public static void main(String[] args) {
		
		int count=0;
		String s="java,programming,language,object,oriented,language";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);

		String str[]=s.split(","); // This Method Use For Split The 
		                          // The String Fom Regrax ( ',' comma)
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
			count++;
		}
		System.out.println(count);
	}

}
