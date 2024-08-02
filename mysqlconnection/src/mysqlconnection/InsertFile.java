package mysqlconnection;

import java.io.*;
import java.sql.*;

public class InsertFile 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st33","root","S@iee918");
//			PreparedStatement ps1 = con.prepareStatement("insert into StuFiles values(?,?)");
//			File f = new File("D:/Saiee/saiee.txt");
//			FileReader fr =new FileReader(f);
//			ps1.setString(1, "Saiee");
//			ps1.setCharacterStream(2,fr,(int)f.length());
//			int i = ps1.executeUpdate();
//			System.out.println(i);
			PreparedStatement ps = con.prepareStatement("select * from profile");
			ResultSet rs = ps.executeQuery("select * from StuFiles");
			rs.next();
			
			Clob c = rs.getClob(2);
			
			Reader r = c.getCharacterStream();
			
			File f1 = new File("D://Saiee/new.txt");
			FileWriter fw = new FileWriter(f1);
			
			
			int j;
			while((j = r.read()) != -1)
				fw.write((char)j);
			fw.close();
			
			
		}
		catch(Exception e)
		{
			
		}
		
	}

}
