package com.loops;
 // Guess The Number And Find Correct Number Find Attempt.
import java.util.Scanner;

public class GuessNo {

	public static void main(String[] args) {
		int number=70;
		int count=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter Number ");
			int num=sc.nextInt();
			count++;
			
			if(number==num)
			{
				System.out.println("You Guess the Correct Number");
				System.out.println("You Guess Correct Number In "+count+" Attempt");
				break;
			}
			else if(number<num)
			{
				System.out.println("You Guess Bigger Number Than Required");
			}
			else
				System.out.println("You Guess Smaller Number Than Required");
		}
		while(true);

	}

}