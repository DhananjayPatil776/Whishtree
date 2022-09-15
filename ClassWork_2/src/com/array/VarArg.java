package com.array;

public class VarArg {

	void accept(String...a)  // Tis Is Syntax Of Vararg
//                             (Data type ,  3 dot and Variable)
	{
		for(String i:a)
		{
			System.out.print(i);
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		VarArg v=new VarArg();
		v.accept("Kinjal"," c ","c++");
		v.accept("RAvi"," Java ","html"," dav");
		v.accept("Sonal");

	}

}
