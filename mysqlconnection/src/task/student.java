package task;

import java.sql.*;


public class student 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass","root","S@iee918");
			Statement st = con.createStatement();
			
			//int i = st.executeUpdate("insert into student values(101,'Narsi')");
			//System.out.println(i);
			
//			ResultSet rs = st.executeQuery("select StId,StAddress from student");
			
			ResultSet rs = st.executeQuery("select * from student where StId = 5");
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
//			int i = st.executeUpdate("update student set StName = 'Kesava' where StId = 2");
//			System.out.println(i);
//			int i = st.executeUpdate("delete from student where StId = 101");
//			System.out.println(i);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
