package Assignement6;

import java.util.*;
/*
Implement the assignment 1 using Linked List */

public class LinkedListAsmt6 
{


	LinkedList<Integer> list = new LinkedList<Integer>();
	
	LinkedList<Integer> saveEvenNumbers(int n)
	{
		list = new LinkedList();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		return list;
		
	}
	LinkedList printEvneNummbers()
	{
		LinkedList A1=new LinkedList();
		for(int i:list)
		{
			A1.add(i*2);
			System.out.println(i*2);
		}
		return A1;
	}
	

	public static void main(String[] args)
	{
		LinkedListAsmt6 A2=new LinkedListAsmt6();
		A2.saveEvenNumbers(10);
		A2.printEvneNummbers();

	}

}

