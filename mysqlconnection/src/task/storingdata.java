package task;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class storingdata 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("name");
		String name =  scan.next();
		String email = scan.next();
		String password = scan.next();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edtech","root","S@iee918");
			
			
			String sql = "INSERT INTO users(username,email,password) values(?,?,?)";
			
			PreparedStatement prst = con.prepareStatement(sql);
			
			prst.setString(1,name);
			prst.setString(2, email);
			prst.setString(3, password);
			
			int row = prst.executeUpdate();
			
			if(row > 0)
			{
				System.out.println("Insertion Success");
			}
			else
			{
				System.out.println("Insertion Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
