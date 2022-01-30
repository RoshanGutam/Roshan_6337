package IfStatements;

import java.util.Scanner;

public class IfElse {
	public static void main(String srgs[])
	{
		System.out.println("Enter Your marks: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		if(number>36)
		{
			System.out.println(" You are passed in exam");
		}
		else 
		{
			System.out.println(" You are failed in exam");
		}
	}

}
