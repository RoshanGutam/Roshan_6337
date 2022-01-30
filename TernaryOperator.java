package Operators;

public class TernaryOperator {
	public static void main(String srgs[])
	{
		int a=10;
		int b=20;
		int min=(a>b)? a:b;          // 10 smaller then 20, so the condition
		                            //  is not true.so it goes for next value
		System.out.println(min);
		
		int max=(b>a)? b:a;       // here 20 is grater then 10,so the condition is true
		System.out.println(max);
	}

}
