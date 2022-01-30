package Inheritance;

class Batman 
  	{
	 public void Superhero()
	 
	    {
		 	System.out.println("Batman can Kill Superman");
	    }
	}
class Superman extends Batman 
	{
	
	 public void Superhero() 
	 	{ 
		   // super.Superhero();
		 	System.out.println("Superman can kill Batman");
	 	}
	}

	

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Superman obj = new Superman(); // 
		 obj.Superhero();
	}

}
