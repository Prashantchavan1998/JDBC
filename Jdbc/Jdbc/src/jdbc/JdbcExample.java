package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		System.out.println("Connected");
		Statement st=con.createStatement();
		//String q="create table prashant (Id int, Name varchar(50), Address varchar(50), Contact varchar(15))";
		//st.execute("Insert into prashant values(1,'Prashant Chavan','Sangamner Maharashtra','8459342890')");
		st.executeQuery("select *from prashant");
		System.out.println("data is inserted");
	}

}
