package IfStatements;
//Greatest value
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		a=sc.nextInt();
		System.out.println("Enter b value: ");
		b=sc.nextInt();
		System.out.println("Enter c value: ");
		c=sc.nextInt();
		
		
		if(a>b)
		{
			if(a>c)
				max=a;
			else
				max=c;
		}
		else
		{
			if(b>c)
				max=b;
			else
				max=c;
		}
		System.out.println("\n max value is  "+max);

	}

}
