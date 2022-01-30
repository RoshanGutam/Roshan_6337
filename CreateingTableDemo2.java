package JDBC;
import java.sql.*;
public class CreateingTableDemo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///testdemo4","root","12345");
			Statement stmt=con.createStatement();
			String query="Create table demotable4(id int,name varchar(20),city varchar(20))";
			int i=stmt.executeUpdate(query);
			System.out.println("Table is created" +i);
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception has Occured"+e);
		}

	}

}
