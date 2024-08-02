package mysqlconnection;

import java.sql.*;


public class DynamicDemo 
{
	public static void main(String[] args) 
	{
		try
		{
		String str = "student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st33","root","S@iee918");
		//PreparedStatement st = con.prepareStatement("select * from "+str+"");
		//PreparedStatement st1 = con.prepareStatement("alter table "+str+" values(?,?,?,?,?,?,?)");
		PreparedStatement st2 = con.prepareStatement("DELETE FROM "+str+" where StuId = ?");
		st2.setInt(1,111);
//		st1.setString(3, "CSE");
//		st1.setString(4,"SRIET");
//		st1.setString(5,"Kurnool");
//		st1.setInt(6,22);
//		st1.setInt(7,20041018);
		
//		int i = st1.executeUpdate();
		int i = st2.executeUpdate();
		PreparedStatement st = con.prepareStatement("select * from "+str+"");
		ResultSet rs =st.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getDate(7));
			
		}
		ResultSetMetaData rsmd = rs.getMetaData();
		
		System.out.println(rsmd.getTableName(1));
		
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
