package ExceptionHandling;


public class TytAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		try
		{
			a=0;
			b=32/a;
			System.out.println("This will not print");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero");
		}
		finally
		{
		  System.out.println("After tha catch block remaining program");
		}

	}

}
