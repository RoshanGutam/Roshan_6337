package Assignement;
//Create a Java code to copy an Array into another array. [Solution: Java Code to Copy Array into
import java.util.Scanner;

public class CopyAnArrrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Arrar Size: ");
		int x=sc.nextInt();
		
		
		int[] arr=new int [x];
		int[] srr=new int [x];
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("First Array values are: ");
		
		for(int i=0;i<x;i++)
		{
			System.out.println(" "+arr[i]);
		}
		System.out.println("Second Array values are: ");
		for(int i=0;i<x;i++)
		{
			srr[i]=arr[i];
			System.out.println(" "+srr[i]);
		}
		

	}

}
