package Assignement5;

import java.util.Scanner;

/*2. Write a Java program to check whether the character immediately
before and after a specified character is same in a given string. */
public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String a=sc.nextLine();
		
		boolean found=false;
		for(int i=0;i<a.length();i++)
		{
			String temp=a.substring(i, i+1);
			if(temp.equals("#") && 1>0 && i <a.length()-1)
			{
				if(a.charAt(i-1) == a.charAt(i+1))
				{
					found = true;
				}
				else {
					found =false;
				}
			}
			
		}System.out.println("The before and after character are same:"+found);
		
	}

}
