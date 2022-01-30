package Assignement;

public class FunctionDemo {

	
		int a,b; // instance variable , data member
		public void input()  // member function
		{
			System.out.println("This is input method");
		}
		public void output()
		{
			System.out.println("This is output method");
		}
		public static void main(String args[])
		{
		  System.out.println("this is main method");
		  FunctionDemo obj=new FunctionDemo();
		  obj.input();
		  obj.output();
		  
		}
		
	  	
		
	}



