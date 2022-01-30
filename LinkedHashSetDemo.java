package CollectionD;
import java.util.*; 

public class LinkedHashSetDemo {
	    public static void main(String args[])
	    {  
	          // Create LinkedHashSet
	          LinkedHashSet subjects = new LinkedHashSet();
	 
	          // Add elements to HashSet
	          subjects.add("Java");
	          subjects.add("Angular");
	          subjects.add("Spring");
	          subjects.add("Oracle");
	          subjects.add("MySQL");
	 
	          //Add duplicate elements to LinkedHashSet
	          subjects.add("Java");
	          subjects.add("Spring");
	 
	          //Add null values to LinkedHashSet
	          subjects.add(null);
	          subjects.add(null);
	 
	          //Print LinkedHashSet elements
	          System.out.println(subjects);
	 
	    }  
}
