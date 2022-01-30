package Assignement;
/*1.Java Program to find average of an int Array. 
    [ Solution Program : Calculate Average of Array Elements in Java ]*/
public class AverageOfAnArray {
	public static void main(String args[])
	{
		int marks[]= {50,65,89,78,69};
		int avg=0;
		
	for(int i=0;i<marks.length;i++)
	{
		System.out.println("marks at ["+i+"]" +marks[i]);
		avg+=marks[i];
	
	
	}
	 System.out.println("Total Average = " +avg);
	
	}

}
