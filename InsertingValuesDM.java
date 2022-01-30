package JDBC;
import java.sql.*;
public class InsertingValuesDM {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///testdemo4","root","12345");
			Statement stmt=con.createStatement();
			
			String query="insert into demotable4(id,name,city)values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 103);
			pstmt.setString(2, "Nani");
			pstmt.setString(3, "VIZ");
			
			int i=pstmt.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Record is Inserted"+i);
			}
			else
			{
				System.out.println("Not Inserted");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception has Occured"+e);
		}

	}

}
