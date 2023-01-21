package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcExamplemethod2 
{

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2", "root", "root");
		System.out.println("Connected");
		Statement st = con.createStatement();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Id:");
			int id = sc.nextInt();
			System.out.println("Enter the Name:");
			String name = sc.next();
			System.out.println("Enter the Address:");
			String Add = sc.next();
			System.out.println("Enter the contact:");
			String cont = sc.next();
			System.out.println("Entre the email:");
			String mail = sc.next();

			st.executeUpdate("insert into prashant values('" + id + "','" + name + "','" + Add + "','" + cont + "','"
					+ mail + "')");
			System.out.println("Data updated Sucessfully");
			System.out.println("Do you want to continue [Yes/No]");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("No"))
			{
				System.out.println("Thank you for using my application");
				break;
			}
		}
	}
}
