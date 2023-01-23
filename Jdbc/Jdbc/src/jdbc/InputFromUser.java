package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class InputFromUser 
{

	public static void main(String[] args) throws Exception 
	{
		while(true)
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		System.out.println("Connected");
		Statement st=con.createStatement();
		System.out.println("Insert the details of employee");
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id:");
		int id=sc.nextInt();
		
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=ab.nextLine();
		
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the address:");
		String Add=y.nextLine();
		
		Scanner bc=new Scanner(System.in);
		System.out.println("Enter the Contact details:");
		String Con=bc.nextLine();
		
		Scanner u=new Scanner(System.in);
		System.out.println("Enter the mail Id:");
		String mail=u.nextLine();
		
		String sql=String.format("insert into prashant values(%d,'%s','%s','%s','%s')",id,name,Add,Con,mail);
		st.execute(sql);
		System.out.println("Data inserted sucessfully");
		Scanner yes=new Scanner(System.in);
		System.out.println("Do you want to continue [Yes / No]");
		String option=yes.nextLine();
		if(option.equalsIgnoreCase("No"))
		{
			System.out.println("Thank you for using the Application");
			break;
			
		}
		}

}
}
