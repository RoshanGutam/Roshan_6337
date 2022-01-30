package Assignement5;

/*4.Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.

Sample Output:

The given string is: mam is in the room
The number of words ends eith m or n is: 3*/
public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "mam is in the room";
		String c[] =a.split(" ");
		char b=(char) a.length();
		int count = 0;
		for (int i = 0; i <= a.length()-1; i++) 
		{
			
			if (a.endsWith("m")) 
			{
				
				count++;
			}
			/*if (a.endsWith("n")) {
				count++;
			}*/
		}
		

		System.out.println(count);

	}

}
