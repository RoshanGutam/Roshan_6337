package Assignement6;
import java.util.*;
/*Develop a java class with a method saveEvenNumbers(int N) 
  using ArrayList to store even numbers from 2 to N, where N is a 
  integer which is passed as a parameter to the method 
  saveEvenNumbers(). 
>  The method should return the ArrayList (A1) created. In the 
  same class create a method printEvenNumbers()which iterates 
  through the arrayList A1 in step 1, and It should multiply 
  each number with 2 and display it in format 4,8,12….2*N. and 
  add these numbers in a new ArrayList (A2). 
> The new ArrayList (A2) created needs to be returned. Create a 
  method printEvenNumber(int N) parameter is a number N. This 
  method should search the arrayList (A1) for the existence of 
  the number ‘N’ passed. If exists it should return the Number 
  else return zero.Hint: Use instance variable for storing the 
  ArrayList A1 and A2.
  NOTE: You can test the methods using a main method. */

public class ArrayListAsmt1 
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	ArrayList saveEvenNumbers(int n)
	{
		list = new ArrayList();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		return list;
		
	}
	ArrayList printEvneNummbers()
	{
		ArrayList A1=new ArrayList();
		for(int i:list)
		{
			A1.add(i*2);
			System.out.println(i*2);
		}
		return A1;
	}
	

	public static void main(String[] args)
	{
		ArrayListAsmt1 A2=new ArrayListAsmt1();
		A2.saveEvenNumbers(10);
		A2.printEvneNummbers();

	}

}
