package Assignement4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		String s = sc.nextLine(),a="";
		
		int n=s.length();
		for(int i=n-1;i>=0;i--)
		{
			a+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(a)) 
		{ 
			System.out.println("Given String is palindrome");
		}
		else 
		{
			System.out.println("Given String is not Panlindrome");
		}

		
			
	}
}