package CollectionD;
import java.util.*;

public class VectorDemo 
{
	 
        public static void main (String[] args) 
		{ 
	 
			// Vector creation 
			Vector v = new Vector(); 
	 
			//Adding elements to vector
			v.addElement("Shivanshu"); 
			v.addElement("Roxy"); 
			v.addElement("Ganesh"); 
			v.addElement("Shailender"); 
	 
			
			
			
			Iterator iterator = v.iterator(); 
			
			while (iterator.hasNext()) 
				System.out.println(iterator.next()); 
		} 


}
