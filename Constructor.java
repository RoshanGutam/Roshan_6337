package Inheritance;

class Democonstructer 
{
	public Democonstructer()  //1. the constructor name is same as class name
	{
		System.out.println("This is first constructer");//  2.it as no return type
	}

	public Democonstructer(int a)  /// Automatically called when we create of the same class
	{
		System.out.println("This is my Second Constructer");
	}


	
}

public class Constructor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Democonstructer obj=new Democonstructer();
		Democonstructer obj1=new Democonstructer(12);
		
		

	}

}
