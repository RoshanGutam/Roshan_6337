package Inheritance;

	interface cost1
	{
		final  int c=20;
		abstract public void input1();
		abstract public void output1();
	
	}
	interface cost2
	{
		final  int d=30;
		abstract public void input2();
		abstract public void output2();
	
	}
class computer
{
	int cost;
	public void input1()
	{
		cost=20000;
		
	}
	public void output1()
	{
		System.out.println("Price of computer is: "+cost);
	}
	
}
class laptop extends computer implements cost1,cost2
{
	int cost2;
	public void input2() 
	{
		 cost2=40000;
	}
	public void output2()
	{
		System.out.println("price of Laptop is: "+cost2);
	}
}
class both extends laptop implements cost1,cost2
{
	
}

public class MultipleInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		laptop obj=new laptop();
		obj.input1();
		obj.input2();
		obj.output1();
		obj.output2();
				

	}

}
