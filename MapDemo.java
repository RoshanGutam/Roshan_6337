package CollectionD;
import java.util.*;

 class MapDemo
{
	
	    public static void main(String[] args)
	    {
	        Map<String, String> hm = new LinkedHashMap<>();
	 
	        hm.put("USA", "Washington");
	        
	        hm.put("United Kingdom", "London");
	        
	        hm.put("India", "New Delhi");
	        System.out.println("LinkedHashMap : " + hm);
	 
	        hm = new TreeMap<>(hm);
	        System.out.println("TreeMap : " + hm);
	 
	        hm = new HashMap<>(hm);
	        System.out.println("HashMap : " + hm);
	    }
}


