package Array;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size,loc,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of "+ "array : ");  //3
		size=sc.nextInt();                    
		
		int[] a=new int[size];
		System.out.println("Enter Array Elements: ");  //10,20,30
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Array index locatoin to remove the element: "); //array index value to remove
		loc=sc.nextInt();  // loc=1
		
		for(i=loc;i<size-1;i++)   // 1<(3-1) true condition
		{
			a[i]=a[i+1];        // 1+1 =2
		}
		size--;                // size-- =1
		for(i=0;i<size;i++)
		{
			System.out.println("After removing, the present elements are: "+a[i]);
		}
		
	} 
	  

}
