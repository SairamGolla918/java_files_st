package com.fos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.fos.dto.FoodCategory;
import com.fos.dto.Menu;


@Repository
public class MenuDao 
{
	public MenuDao(){};
	
	public ArrayList<Menu> Check()
	{
		ArrayList<Menu> ml = new ArrayList<>();
		
		Connection con = null;
		Statement sm = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/Food_Ordering_System";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","S@iee918");
			
			sm = con.createStatement();
			
			rs = sm.executeQuery("select * from Menu;");
//			rs = sm.executeQuery("select * from Food_Category");
			
			while(rs.next())
			{
				ml.add(new Menu(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getInt(5)));
//				ml.add(new FoodCategory(rs.getInt(1),rs.getString(2)));
			}
				
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ml;
		
	}
}
