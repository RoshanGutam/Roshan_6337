package Assignement;

import java.util.Scanner;

//Take three numbers from the user and print the greatest number
public class GraterNumber {

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
		System.out.println("\n The Gratest number is: "+max);
			

	}

}
