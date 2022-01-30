package IfStatements;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String args[])
	{
		
		System.out.println("Enter your marks: ");
		Scanner sc = new Scanner (System.in);
		int marks=sc.nextInt();
		
		if(marks>=36)
		{
		  System.out.println("Your passed");
		}
		 System.out.println("Congrats");
		
	}
	
}
