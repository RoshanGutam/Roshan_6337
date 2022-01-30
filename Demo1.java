package J8;
interface a
{
	abstract void input(int a,int b);
	
	
}
class lam implements a
{
	

	@Override
	public void input(int a,int b)
	{
		System.out.println(a+b);
		
	}
	
}

public class Demo1 {
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	//	a obj= (a,b)-> {System.out.println(a+b);};
	//	obj.input(10, 20);
	
		
		//Annonymouse class 
		a obj=new a()
				{
			
			       public void input(int a,int b)
			       {
			    	   System.out.println(a+b);
			       }
				};
				obj.input(30, 20);
		

	}

}
