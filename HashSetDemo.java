package CollectionD;
import java.util.*; 

public class HashSetDemo {
	 
	 
	 
	    public static void main(String args[]){  
	          // Create HashSet
	          HashSet subjects = new HashSet();
	 
	          // Add elements to HashSet
	          subjects.add("Java");
	          subjects.add("Angular");
	          subjects.add("Spring");
	          subjects.add("Oracle");
	          subjects.add("MySQL");
	 
	          //Add duplicate elements to HashSet
	          subjects.add("Java");
	          subjects.add("Spring");
	 
	          //Add null values to HashSet
	          subjects.add(null);
	          subjects.add(null);
	 
	          //Print HashSet elements
	          System.out.println(subjects);
	 
	    }  
}
