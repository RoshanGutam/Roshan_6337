package Operators;

public class Bitwiseoperator {
	public static void main(String args[])
	{
		int a=6;   // convertend into binary numbers  0110
		int b=8;   // 1000
		
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		
		System.out.println("a&b= "+(a&b));
		System.out.println("a|b= "+(a|b));
		System.out.println("a^b= "+(a^b));
	}

}

