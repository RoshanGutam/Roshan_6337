package Inheritance;

class sem1
{
	
	int mat,eng,comp;
	public void input1()
	{
		mat=66;
		eng=73;
		comp=80;
		
	}
	public void output1()
	{
		System.out.println("-----Semister 1-------");
		System.out.println("markes in Maths: "+mat);
		System.out.println("Marks in English: "+eng);
		System.out.println("Marks in Computers: "+comp);
		int total=mat+eng+comp;
		System.out.println("Total marks = "+total);
	}
}
class sem2 extends sem1
{
	int ps,ed,mt;
	public void input2()
	{
		ps=56;
		ed=66;
		mt=50;
	}
	public void output2()
	{
		System.out.println("------Semister 2-------");
		System.out.println("Marks in Power Systems:"+ps);
		System.out.println("Marks in Electrical Drives:"+ed);
		System.out.println("Marks in Machine tools:"+mt);
		int total=ps+ed+mt;
		System.out.println("Total Marks = "+total);
	}
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sem2 obj=new sem2();
		obj.input1();
		obj.input2();
		obj.output1();
		obj.output2();
			

	}

}
