package CollectionD;
import java.util.*;

public class ArrayListDemo 
{ 
	public static void main (String[] args) 
		{ 
			// ArrayList creation
			ArrayList j = new ArrayList(); 
	 
			// Adding elements to arraylist 
			j.add("Shivanshu"); 
			j.add("Roxy"); 
			j.add("Ganesh"); 
			j.add("Shailender"); 
	 
			
			
			Iterator iterator = j.iterator();
			
			while (iterator.hasNext()) 
				System.out.println(iterator.next()); 
		}
}


