package Assignement5;

import java.util.StringTokenizer;

/*1. Write a Java program to count how many times the substring 'life' present at anywhere in a given string. 

Sample Output:

The given string is: live on wild life
appear number of times: 1*/
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st1=new StringTokenizer("live on wild life"," ");
		int count=0;
		while (st1.hasMoreTokens()) 
		{
			
			if("life".equals(st1.nextToken())) 
			{
				
				count++;
			}
			
			
		}
		System.out.println("Life is occuring "+count);	
	}

}
