package mysqlconnection;

import java.io.*;
import java.sql.*;

public class InsertImage 
{
	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/st33","root","S@iee918");
//			PreparedStatement prst = con.prepareStatement("INSERT INTO profile values(?,?,?)");
//			prst.setInt(1,101);
//			prst.setString(2, "Alice Johnson");
//			File imageFile = new File("D:/JAVA/stu3.jpg");
//			FileInputStream fis = new FileInputStream(imageFile);
//			prst.setBinaryStream(3, fis,fis.available());
//			int i = prst.executeUpdate();
//			System.out.println(i);
			PreparedStatement ps = con.prepareStatement("select * from profile");
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				Blob b = rs.getBlob(3);
				byte[] arr = b.getBytes(1, (int)b.length());
				FileOutputStream fio = new FileOutputStream("D:/saiee/image.jpg");
				fio.write(arr);
			}
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
