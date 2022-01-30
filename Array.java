package Assignement;

import java.util.Scanner;

/*Write a menu driven Java program with following option 
a. Accept elements of an array 
b. Display elements of an array 
c. Search the element within array given by user
d. Sort the array using bubble sort method 
Write methods for all options. The methods should be static and have one parameter name of the array. */
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//a.to Accept the elements of Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		
		int[] arr=new int [a];
		System.out.println("Enter the Elements of Array: ["+a+"] ");
		for (int i =0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		//b.Display the elements of array
		for(int i=0;i<a;i++)
		{
			System.out.println("Elements of array are: "+arr[i]);
		}
		
		//Search the element
		Scanner s=new Scanner(System.in);
		System.out.println("Search the element in Array:");
		int b=s.nextInt();
		
		int find=b;            
		boolean check=false;
		for(int elements:arr)
		{
			if(elements==find)
			{
				check=true;
				break;
			}
		}
		if(check)
		 {
			System.out.println("The element is found in array");
		 }
		else
		{
			System.out.println("The element is not found in array");
		}
		
		//Sort the array using bubble sort method
		int temp=0;
		for(int i=0;i<a-1;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		} 
		System.out.println("After Sorting ");
		for(int i=0;i<a;i++)
		{
		   System.out.println("elements are in["+i+"] "+arr[i]);
		}
		
		
		
		
		

	}

}
