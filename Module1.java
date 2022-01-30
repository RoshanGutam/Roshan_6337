package project;

public class Module1 
{
	  String First_Name,Last_Name, College_id, User_id;
	  int Semester;
	  
	  public void getdata(String fname,String lname,String clgid,String uid , int sem)
	  {
	   	
	     this.First_Name=fname;
	   	 this.Last_Name=lname;
	   	 this.College_id=clgid;
	   	 this.User_id=uid;
	   	 this.Semester=sem;
	   	 
	  }
	  public void setdate()
	  {
		  System.out.println("Student's First Name : "+First_Name);
		   System.out.println("Student's Last Name : "+Last_Name);
		   System.out.println("Student's College ID: "+College_id);
		   System.out.println("Student's User ID : "+User_id);
		   System.out.println("Student's Semester : "+Semester);
		  
	  }
}


