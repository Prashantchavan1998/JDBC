package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultsetExample 
{

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		System.out.println("Connected");
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select *from prashant");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		}
		catch(Exception ex)
		{
			
		}
	}

}
