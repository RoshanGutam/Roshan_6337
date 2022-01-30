package Inheritance;

class sem1 {
	

	int mat, eng, comp;

	  public  void  input1()
	  {
		mat = 66;
		eng = 73;
		comp = 80;

	}

	  public  void output1() 
	  {
		System.out.println("\n-----Semister 1-------\n");
		System.out.println("markes in Maths: " + mat);
		System.out.println("Marks in English: " + eng);
		System.out.println("Marks in Computers: " + comp);
		int total = mat + eng + comp;
		System.out.println("Total marks = " + total);
	}
}

class sem2 extends sem1
{
	int ps, ed, mt;

	public void input2()
	{
		ps = 56;
		ed = 66;
		mt = 50;
	}

	public void output2() 
	{
		System.out.println("\n------Semister 2-------\n");
		System.out.println("Marks in Power Systems:" + ps);
		System.out.println("Marks in Electrical Drives:" + ed);
		System.out.println("Marks in Machine tools:" + mt);
		int total = ps + ed + mt;
		System.out.println("Total Marks = " + total);
	}
}

class sem3 extends sem2 
  {
	int m2, cs, os;

	public void input3() 
	{
		m2 = 59;
		cs = 68;
		os = 50;
	}

	public void output3() 
	{
		System.out.println("\n------Semister 3-------\n");
		System.out.println("Marks in Maths 2:" + m2);
		System.out.println("Marks in Control Strectures:" + cs);
		System.out.println("Marks in Operating Systems :" + os);
		int total = m2 + cs + os;
		System.out.println("Total Marks = " + total);
	}
}

public class Multilevel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sem3 obj=new sem3();
		obj.input1();
		obj.input2();
		obj.input3();
		obj.output1();
		obj.output2();
		obj.output3();
	}

}
