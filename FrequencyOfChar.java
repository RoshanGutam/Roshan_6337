package Assignement4;

import java.util.Scanner;

//5. Write a Java program to print the frequency of each character in a string.
public class FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a=sc.nextLine();
		
		System.out.println("All String valurs are converten into lowercases:"+ a.toLowerCase());
		System.out.println("the length of strng is: "+ a.length());
		
		
		int count=0;
		for(int i=0;i<a.length();i++)
		{ 	
			char b=(a.charAt(i));
			for(int j=0;j<a.length();j++)
			{
				if( b == a.charAt(j) )
				count++;
			}
			System.out.println("Frequency of string at "+a.charAt(i)+": "+count);
			count=0;
		}
		

	}

}
