package Assignement6;
import java.util.*;

/*Create an ArrayList which will be able to store only Strings. 
Create a printAll method which will print all the elements 
using an Iterator.*/

public class ListIterAsmt3
{
	public static void main(String args[])
	{
     List<String> lst=new ArrayList<String>();
     lst.add("Hello");
     lst.add("World");
     lst.add("Welcome to");
     lst.add("Java");
      
     printAll(lst);
	}

	private static void printAll(List<String> lst) 
	{
		// TODO Auto-generated method stub
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
