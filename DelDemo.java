package JDBC;

import java.sql.*;

public class DelDemo {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///testdemo4", "root", "12345");
			Statement stmt = con.createStatement();

			String query = "delete from demotable4 where id=100";
			// String query="Create table demotable4(id int,name varchar(20),cityvarchar(20))";
			int i = stmt.executeUpdate(query);
			System.out.println("Updated" + i);
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception has Occured" + e);
		}

	}
}
