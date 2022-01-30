package Inheritance;

abstract class bike
{
	abstract void run();
}
class Honda extends bike
{
	public void run()
	{
		System.out.println("Ride Safely");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda obj=new Honda();
		obj.run();

	}

}
