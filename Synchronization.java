package Multithreading;


class Demo
{
	synchronized public void show()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("Runs first");
		}
	}
}
class AThread extends Thread
{
	Demo d;
	public AThread(Demo obj)
	{
		d=obj;
	}
	public void run()
	{
		System.out.println("Thread A");
		d.show();
	}
}

class BThread extends Thread
{
	Demo d;
	public BThread(Demo obj)
	{
		d=obj;
	}
	public void run()
	{
		System.out.println("Thread B");
		d.show();
	}
}
class CThread extends Thread
{
	Demo d;
	public CThread(Demo obj)
	{
		d=obj;
	}
	public void run()
	{
		System.out.println("Thread C");
		d.show();
	}
}

public class Synchronization
{
	public static void main(String[]args)
	{
	

		Demo d=new Demo();
		AThread obj1=new AThread(d);
		BThread obj2=new BThread(d);
		CThread obj3=new CThread(d);

		obj1.start();
		obj2.start();
		obj3.start();
		
		
	
		for(int i=0;i<=6;i++)
		{
			System.out.println("Main");
		}
	
	}
}



