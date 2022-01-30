package CollectionD;
import java.util.*;

public class LinkedListDemo 
{
	
 
		public static void main (String[] args) 
		{ 
			// LinkedList creation
			LinkedList list = new LinkedList(); 
	 
			// Adding elements to arraylist 
			list.add("Shivanshu"); 
			list.add("Roxy"); 
			list.add("Ganesh"); 
			list.add("Shailender"); 
	 
		
			Iterator iterator = list.iterator(); 
			
			while (iterator.hasNext()) 
				System.out.println(iterator.next()); 
	 
		} 
}
