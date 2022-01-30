package Operators;
// program for increment and decrement
public class IncrementAndDecrement {
	public static void main(String args[])
	{
		int a=20;
		int b=10;
		
		System.out.println("++a= "+(++a) );  // pre-increment
		System.out.println("b++= "+(b++));   //post-increment
		System.out.println("b++= "+(b++));  
		System.out.println("++b= "+(++b));   //pre-increment
		System.out.println("a++= "+(a++));   //post-increment
	}

}
