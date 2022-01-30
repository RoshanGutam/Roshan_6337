package ExceptionHandling;

public class Demo25 
{
	//overriding program


	

	    public static String retString() 
	    {
	        return"Parent";
	    }
	    public static void main(String[] args) 
	    {
	         
	        SourceSubClass obj = new SourceSubClass();
	        String result = retString();
	        String result1 = obj.retString();
	        System.out.println(result);
	        System.out.println(result1);
	    }

	}
	class SourceSubClass extends Demo25
	{
	    public static String retString() 
	    {
	        return"Child";
	    }	
}



