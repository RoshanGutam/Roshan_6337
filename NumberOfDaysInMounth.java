package Assignement;

import java.lang.*;
import java.util.Scanner;

//Write a Java program to find the number of days in a month.
public class NumberOfDaysInMounth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mounth Number: ");
		char r=sc.next().charAt(0);
		
		
		if(r=='j')
		{
				System.out.println("January - 31 days");
		}
		else if(r==2)
		{
			System.out.println("Feberuary - 28 days");
		}
		else if(r==3)
		{
			System.out.println("March - 31 days");
		}
		else if(r==4)
		{
			System.out.println("April - 30 days");
		}
		else if(r==5)
		{
			System.out.println("May - 31 days");
		}
		else if(r==6)
		{
			System.out.println("June - 30 days");
		}
		else if(r==7)
		{
			System.out.println("July - 31 days");
		}
		else if (r==8)
		{
			System.out.println("Augest - 31 days");
		}
		else if (r==9)
		{
			System.out.println("September -30 days");
		}
		else if (r==10)
		{
			System.out.println("Octember - 31 days");
		}
		else if (r==11)
		{
			System.out.println("Noember -30 days");
		}
		else if(r==12)
		{
			System.out.println("December - 31 days");
		}
		else
		{
			System.out.println("You enter Invalide Month Number!!");
		}
		
	}

}
