package Assignement6;
import java.util.*;

/*Write a program to store a group of employee names into a HashSet, retrieve 
the elements one by one using an Iterator.*/

public class Setasmt2 
{
       public static void main(String args[])
       {
    	   HashSet<String> h=new HashSet<String>();
    	   h.add("Ravi");
    	   h.add("Ram");
    	   h.add("Raja");
    	   h.add("Ramesh");
    	   h.add("Rajeev");
    	   
    	   Iterator itr=h.iterator();
    	   while(itr.hasNext())
    	   {
    		   System.out.println(itr.next());
    	   }
       }
    
}
