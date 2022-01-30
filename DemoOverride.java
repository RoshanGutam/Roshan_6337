package Annotation;

class Teacher
{
	void Assignement() 
	{
		System.out.println("No time to do Assignement");
	}

	
}
class Student extends Teacher
{
	@Override
	void Assignement() 
	{
		System.out.println("Make time to do Assignement");
	}
}

public class DemoOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.Assignement();

	}

}
