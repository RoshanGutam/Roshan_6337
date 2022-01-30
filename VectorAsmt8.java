package Assignement6;
import java.util.*;

/*Write a program that will have a Vector which is capable of 
storing emp objects. Use an Iterator and enumeration to list 
all the elements of the Vector.
*/

public class VectorAsmt8
{

	public static void main(String args[])
	{
		Vector<String> vr=new Vector<String>();
		vr.add("Ram");
		vr.add("Syam");
		vr.add("Siddhu");
		vr.add("Ravi");
		vr.add("Bobby");
		vr.add(null);
		
		Enumeration emp=vr.elements();
		 
		System.out.println("Elements of vector is: ");
		
		Iterator itr=vr.iterator();
		while(emp.hasMoreElements())
		{
			System.out.println(emp.nextElement());
		}
		
	}
}
