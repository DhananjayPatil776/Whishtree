package com.thiskeyword;

public class ThisAsParameter 
{
	int x=10;
	
	/*void accept(int x)
	{
		System.out.println("x= "+x);
		x=x+10;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		ThisAsParameter t=new ThisAsParameter();
		t.accept(20);
		System.out.println("Instance X = "+t.x);
		*/
		
		void accept(ThisAsParameter t)
		{
			t.x=t.x+10;
			System.out.println(this.x);
		}
		void accept1()
		{
			accept(this); // Here call 'Accept' Method Of Current Class
		}
		
		public static void main(String[]args)
		{
			ThisAsParameter t=new ThisAsParameter();
			System.out.println(t); // This Is For Print Address
		
			t.x=20;  // Change The X Value Through Its Address
			
			t.accept1();
			System.out.println(t.x);
		}

}