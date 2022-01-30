package Assignement4;
//3. Write a Java program to print after removing duplicates from a given string.

import java.util.Scanner;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String: ");
			String a = sc.nextLine();

			char b[] = new char[a.length()];
			StringBuilder remv = new StringBuilder();
			for (int i = 0; i < b.length; i++) 
			{
				boolean repated = false;
				for (int j = i + 1; j < b.length; j++) 
				{
					if (b[i] == b[j]) 
					{
						repated = true;
						break;                            /// not working
					}
				}
				if (!repated) 
				{
					remv.append(b[i]);
				}

			}
			System.out.println(remv);
		}
	}


