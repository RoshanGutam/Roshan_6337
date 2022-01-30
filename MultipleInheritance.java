package Inheritance;

interface Marks
{
	final static int marks=30;
	abstract public void input1();
	abstract public void input2();
	abstract public void output1();
	abstract public void output2();
}

class sem4 extends Marks 
{
	int mat, eng, comp;

	public void input1() {

		mat = 66;
		eng = 73;
		comp = 80;

	}

	public void output1() 
	{
		System.out.println("-----Semister 1-------");
		System.out.println("markes in Maths: " + mat);
		System.out.println("Marks in English: " + eng);
		System.out.println("Marks in Computers: " + comp);
		int total = mat + eng + comp;
		System.out.println("Total marks = " + total);
	}
	
}
class sem4 extends sem4 implements marks 
{
	int m2, cs, os;

	public void input3() {
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

public class MultipleInheritance
{
	public static void main(String args[])
	{
		
	}

}
