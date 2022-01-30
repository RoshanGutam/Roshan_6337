package Assignement4;

import java.util.Scanner;

public class FindMaxOccuringCharacter {
////Write a Java program to find the maximum occurring character in a string
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a=sc.nextLine();
		
		System.out.println("All String valurs are converten into lowercases:"+ a.toLowerCase());
		System.out.println("the length of strng is: "+ a.length());
		
		
		int count=0,maxcount=0;
		char c = 0;
		for(int i=0;i<a.length();i++)
		{ 	
			count=0;
			char b=(a.charAt(i));
			for(int j=0;j<a.length();j++)
				{
			if( b == a.charAt(j) )
				count++;
				}
			
			if(maxcount<count)
				{
				maxcount=count;
				c=a.charAt(i);
				}	
		}System.out.println("max occuring character is "+c+" : "+maxcount);
		
		
	}

}
