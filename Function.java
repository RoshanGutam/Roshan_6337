package Array;

public class Function 
{
	int a,b;
	public void input(int c,int d)
	{
		a=c;
		b=d;
		System.out.println("This is input method");
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
	public void output()
	{
		System.out.println("This is output meythod");
	}
	public int mul()
	{
		return a*b;
	}
	public int add()
	{
		return  a+b;
	}
	public static void main(String args[])
	{
		System.out.println("This is main method");
		
		Function obj=new Function();
		obj.input(30,10);
		obj.output();
		
		int result= obj.mul();
		System.out.println("Multiplication of a and b ="+result);
		
		int sum=obj.add();
		System.out.println("Addition of and b is = "+sum);
	}
	
	

}
