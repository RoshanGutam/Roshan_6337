package Assignement4;
//Write a Java program to find the maximum occurring character in a string
public class CountOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Max occuring character in a string ";
		
		int totalcount = s.length();   // here total of string
		int count=s.replace("c", "").length();  // replacing the value, with empty space
		int total=totalcount-count;             //compare total string values to - after removing 'c' from string
		System.out.println("Number occering of c is:"+total);
		

	}

}
