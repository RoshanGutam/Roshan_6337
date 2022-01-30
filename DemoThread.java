package Multithreading;
//implementing extends  Thread classes

//class Syn 
//{
//	public void print()
//	{
//		synchronized(Thread.currentThread())
//		{
//			for(int i=0;i<4;i++)
//			{
//				System.out.println(Thread.currentThread());
//			}
//		}
//	}
//}
class A extends Thread
{
   public void run()
   {
	   System.out.println("Thread A is Started");
	   for(int i=0;i<4;i++)
	   {
		   System.out.println("Thread A is running "+i);
	   }
	   System.out.println("Thread A is Stoped");
   }
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B is Started");
		for(int i=0;i<4;i++)
		{
			System.out.println("Thread B is Running "+i);
		}
		System.out.println("Thread B is Stoped");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Thread C is Started");
		for(int i=0;i<4;i++)
		{
			System.out.println("Thread c is Running "+i);
		}
		System.out.println("Thread c is Stoped");
	}
}

public class DemoThread 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		
		obj1.start();
		obj2.start();
		obj3.start();

	}

}
