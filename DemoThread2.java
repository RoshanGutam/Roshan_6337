package Multithreading;
//Program  using Implements Runnable interface

class A implements Runnable
{
  public void run() 
  {
	  System.out.println("Thread A is Started");
	  for(int i=0;i<3;i++)
	  {
		  System.out.println("Thread A is Running "+i);
		  
	  }
	  System.out.println("Thread A is Stopped");
  }
}
class B implements Runnable
{
	public void run() 
	{
		System.out.println("Thread B is Started");
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread B is Running "+i);
		}
		System.out.println("Thread B Stoppred");
	}
}
class C implements Runnable
{
	public void run() 
	{
		System.out.println("Thread C is Started");
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread C is Running "+i);
		}
		System.out.println("Thread C Stoppred");
	}
}

public class DemoThread2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
