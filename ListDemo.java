package CollectionD;
import java.util.*;



public class ListDemo {

	public static void main(String[] args) 
	{
		List list =  new ArrayList( );
		
		list.add("R");
		list.add("A");
		list.add("M");
		list.add("U");
		
		System.out.println(list);
		System.out.println("Size of list is : "+list.size());
		
		System.out.println("##########################");
		
		Iterator r=list.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		System.out.println("\n***********************\n");
		
		for(int i=0;i<list.size();i++) // Normal for loop
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(Object s:list)  // Enhanced Loop
		{
			System.out.println(s);
		}
	}

}
