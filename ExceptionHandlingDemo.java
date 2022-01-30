package ExceptionHandling;

public class ExceptionHandlingDemo
{
	int arr[]= {2,12,55,78,9,5};
	
	public void display()
	{
		try 
		{
		System.out.println("Print arr[2]"+arr[2]);
		System.out.println("Print arr[10]"+arr[10]);
		}
		catch(Exception e)
		{
			System.out.println("\"ALERT! Exception Occured here.\"");
		}
		finally
		{
		   System.out.println("Entered Final Block");	
		}
	}
	public void display2()
	{
		try
		{
			System.out.println("Print arr[3]"+arr[3]);
			System.out.println("Print arr[11]"+arr[11]);
		}
		catch(Exception e)
		{
			System.out.println("\"ALERT! Exception Occured here.\"");
		}
		finally
		{
			System.out.println("Entered Final block2");
		}
	}

	public static void main(String[] args) 
	{
		ExceptionHandlingDemo obj=new ExceptionHandlingDemo();
		obj.display();
		obj.display2();

	}

}
