package mysqlconnection;


import java.sql.*;


public class MetaData 
{

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st33","root","S@iee918");
		DatabaseMetaData Md = con.getMetaData();
		
		System.out.println(Md.getDatabaseMajorVersion());
		System.out.println(Md.getDatabaseMinorVersion());
		System.out.println(Md.getDatabaseProductName());
		System.out.println(Md.getDatabaseProductVersion());
		System.out.println(Md.getDriverName());
		System.out.println(Md.getDriverVersion());
		System.out.println(Md.getSchemas());
		System.out.println(Md.getUserName());
		
		
//		while(rsmd.next())
//		{
//			System.out.println(rs);
//			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getDate(7));
//		}
		//System.out.println(Md.getTableTypes());
		
		
		}
		catch (Exception e) {
			
		}

	}

}
