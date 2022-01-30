package JDBC;
import java.sql.*;

public class CreatingTable
{ 
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try
		{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("Jdbc:mysqul:///roy","root","12345");
		  Statement stmt=con.createStatement();
		  
		  String query="create table rtable1(id int, name varchar(20)";
		  ResultSet rs=stmt.executeQuery(query);
		//  stmt.executeUpdate(query);
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+" "+rs.getString(2));
		  }
		}
		catch(Exception e)
		{
			System.out.println("Exception has Occured"+e);
		}

	}

}
