package project;

import java.util.Scanner;

public class Main 
{
	public static void main(String args[]) 
	{
		System.out.println("  -------Library Management Ststem--------  ");
		System.out.println(" ");
		
		Scanner obj=new Scanner(System.in);
		
		int choice = 0;
		
		while(choice !=4)
		{
			System.out.println(" Press 1 -   Admin Login \n Press 2 -   Library ");
			choice = obj.nextInt();
			
			if(choice == 1)
			{
				Module1 obj1= new Module1();
				
				    System.out.println("Enter Student Name : ");
				obj1.First_Name=obj.nextLine(); obj1.Last_Name=obj.nextLine();
		    	    System.out.println("Enter University ID : ");
		    	obj1.College_id=obj.nextLine();
		    	    System.out.println("Enter User ID : ");
		    	obj1.User_id=obj.nextLine();
		    	     System.out.println("Enter the Semister : ");
		    	obj1.Semester=obj.nextInt();
		    	
		    	
		    	obj1.getdata(obj1.First_Name,obj1.Last_Name, obj1.College_id, obj1.User_id, obj1.Semester);
		    	obj1.setdate();
		    	
		    	}
			else if(choice == 2)
			{
				Module2 obj2 =new Module2();
				
				obj2.Computer();
				obj2.Civil();
				obj2.Electrical();
				obj2.Physics();
			}

		}
	}
}
