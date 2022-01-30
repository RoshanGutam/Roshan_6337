package Itteration;

public class DoWhileLoop {
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		do 
		{
			sum = sum+i;
			i++;
			
		}
		while (i<=15);
		System.out.println("\n\n Sum of 1 to 15 is: "+sum);
	}

}
