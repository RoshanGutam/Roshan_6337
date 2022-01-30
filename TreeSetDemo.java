package CollectionD;
import java.util.*;


public class TreeSetDemo 
{
	  
	 
	    public static void main(String args[]){  
	          // Create TreeSet
	          TreeSet subjects = new TreeSet();
	 
	          // Add elements to HashSet
	          subjects.add("Java");
	          subjects.add("Angular");
	          subjects.add("Spring");
	          subjects.add("Oracle");
	          subjects.add("MySQL");
	 
	          //Add duplicate elements to TreeSet
	          subjects.add("Java");
	          subjects.add("Spring");
	          
	       //   subjects.add(null); Does not allow null elements
	 
	          //Print TreeSet elements
	          System.out.println(subjects);
	 
	    }  
}


