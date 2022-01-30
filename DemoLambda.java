package J8;

interface lamDemo
{
	abstract public void show();
}
class Demo implements lamDemo
{
	public void show()
	{
		String a="hello";
	}
}


public class DemoLambda 
{ 


	public static void main(String[] args) 
	{
		lamDemo obj=new lamDemo()->{System.out.println(a);};

	}

}
 