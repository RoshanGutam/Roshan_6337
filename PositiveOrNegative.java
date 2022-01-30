package Assignement;
//Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value: ");
		int i =sc.nextInt();
		
		if(i>0)
		{
			System.out.println("The Number is Positive "+i);
		}
		else
		{
			System.out.println("The number is Negative"+i);
		}
	}

}
