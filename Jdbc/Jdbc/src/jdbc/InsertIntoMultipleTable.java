package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class InsertIntoMultipleTable
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		System.out.println("Connection Success");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter Name:");
		String Name=sb.nextLine();
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter Address:");
		String Add=ab.nextLine();
		System.out.println("Enter the position:");
		String po=sb.nextLine();
		Scanner yb=new Scanner(System.in);
		System.out.println("Enter Salary:");
		String sal=yb.nextLine();
		
		String sql=String.format("insert into project values(%d,'%s','%s','%s','%s')",id,Name,Add,po,sal);
		
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.executeUpdate();
		pst.close();
		
		String sql1=String.format("insert into chavan values(%d,'%s','%s','%s','%s')",id,Name,Add,po,sal);
		pst=con.prepareStatement(sql1);
		pst.executeUpdate();
		pst.close();
		
		con.close();

	}

}
