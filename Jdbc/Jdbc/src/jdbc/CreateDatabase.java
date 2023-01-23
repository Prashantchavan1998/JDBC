package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase
{

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "root");
		System.out.println("Connection Sucess");
		Statement st= con.createStatement();
		
		while(true)
		{
			String q="create table Project(Id int, Name varchar(50), Address varchar(50),Position varchar(50),Salary int)";
			
		st.executeUpdate(q);
		System.out.println("table is created");
		
		/*
		 * if(q.compareToIgnoreCase("No")) {
		 * 
		 * }
		 */
		}
		
		
	}

}
