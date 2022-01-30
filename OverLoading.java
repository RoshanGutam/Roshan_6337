package Inheritance;

class M_Overload
{
	public void result(double x,double y)
	{
	
		double total=  x+y;
		System.out.println("Sum of x+y is : "+total);
	}
	public void result(int a,int b,int c)
	{
		int mul =a*b*c;
		System.out.println("Multiple of a*b*c is: "+mul);
	}
	public void result(int m,int n)
	{
		int value=m/n;
		System.out.println("M Devision of N is : "+value);
	}
}

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M_Overload obj=new M_Overload();
		obj.result(2.5, 3.75);
		obj.result(2, 5, 5);
		obj.result(50, 2);
	}

}
