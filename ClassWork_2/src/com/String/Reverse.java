package com.String;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		
		String s="hello";
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println(s);
		
//		for(int i=0;i<ch.length;i++)
//		{
//			char temp=ch[i];
//			ch[i]=ch[ch.length-i-1];
//			ch[ch.length-i-1]=temp;
//			
//		}
		System.out.println(Arrays.toString(ch));
		System.out.println(s.charAt(0));

	}

}
