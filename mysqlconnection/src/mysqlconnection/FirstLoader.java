package mysqlconnection;

import java.sql.*;

public class FirstLoader 
{
	
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st33","root","S@iee918");
			Statement st = con.createStatement();
			
			//int i = st.executeUpdate("insert into student values(1,'Saieeyadav','CSE','IIIT RK VALLEY','Nandikotkur,Kurnool,AP',22,'20020104')");
			//System.out.println(i);
			
			//int j = st.executeUpdate("update student set StuName='Saiee Yadav' where StuId=1");
			//System.out.println(j);
			//int k = st.executeUpdate("delete from student where StuBranch = 'Mech'");
		
			ResultSet rs = st.executeQuery("select * from student");
			
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getDate(7));
				
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
