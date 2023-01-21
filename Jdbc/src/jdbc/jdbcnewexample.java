package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcnewexample 
{

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/JDBCExample";
		String user="root";
		String pass="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connected");
		Statement st=con.createStatement();
		st.execute("insert into prashant values(10,'Prashant Chavan','pune india','8459342890')");
		System.out.println("data inserted");
	}

}
