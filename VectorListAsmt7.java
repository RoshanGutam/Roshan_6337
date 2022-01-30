package Assignement6;

import java.util.*;
/*Implement the assignment 1 using Vector*/

public class VectorListAsmt7 
{


	Vector<Integer> vr = new Vector<Integer>();
	
	Vector saveEvenNumbers(int n)
	{
		vr = new Vector();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				vr.add(i);
			}
		}
		return vr;
		
	}
	Vector printEvneNummbers()
	{
		Vector A1=new Vector();
		for(int i:vr)
		{
			A1.add(i*2);
			System.out.println(i*2);
		}
		return A1;
	}
	

	public static void main(String[] args)
	{
		VectorListAsmt7 A2=new VectorListAsmt7();
		A2.saveEvenNumbers(10);
		A2.printEvneNummbers();

	}

}

