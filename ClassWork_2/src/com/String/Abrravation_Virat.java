package com.String;

public class Abrravation_Virat {

	public static void main(String[] args) {
		
		String s="Virat Surendra Kohali From Delhi";
		
		char ch[]=s.toCharArray();
		int space=0,count=0;
		int i;
		
		for( i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
	//	System.out.println(count);
		
		System.out.print(ch[0]+".");
		
		for( i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				space++;
				if(space<count)
				{
					System.out.print(ch[i+1]+".");
				}
			}
			if(space>count-1)
			{
				break;
			}
		}
		//System.out.println(i);
		
		for(int j=i+1;j<ch.length;j++)
		{
			System.out.print(ch[j]);
		}

	}

}
