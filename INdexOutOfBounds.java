package ExceptionHandling;

public class INdexOutOfBounds 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			int arr[]= {24,3,34,7,20};
			
			System.out.println("/nprint arr[2]----"+arr[2]);
			System.out.println("print arr[5]----"+arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\"ArrayIndexoutOfBoundsException\"");
		}
		finally
		{
			System.out.println("Entered 2nd final block");
		}
		System.out.println("exit finalli block");

	}

}
