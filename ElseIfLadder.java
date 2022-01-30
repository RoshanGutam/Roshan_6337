package IfStatements;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 0 to 6: ");
		int number=sc.nextInt();
		
		if(number==0)
		{
			System.out.println("To day is Sunday");
		}
		else if (number==1)
		{
			System.out.println("To day is monday");
		}
		else if (number==2)
		{
			System.out.println("To day is tuesday");
		}
		else if(number==3)
		{
			System.out.println("To day is wednesday");
		}
		else if (number==4)
		{
			System.out.println("To day is thursday");
		}
		else if(number==5)
		{
			System.out.println("To day is friday");
		}
		else if(number==6)
		{
			System.out.println("To day is saturday");
		}
		else 
		{
			System.out.println("You Enytered Invalid Number");
		}
	}

}
