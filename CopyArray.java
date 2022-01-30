package Assignement;
/*7. Create a Java code to copy an Array into another array. [Solution: Java Code to Copy Array into.*/

import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int m=sc.nextInt();
		
		int[] n=new int[m];
		for(int i=0;i<m;i++)
		{
			n[i]=sc.nextInt();
		}
		System.out.println("the Array is :"+Arrays.toString(n));
		int[] k=n;
		System.out.println("The copy of array is: "+Arrays.toString(k));

	}

}
