package com.gsr.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gsr.bean.Purchases;
import com.gsr.bean.Users;

public class UsersDao {

	public UsersDao() {}
	
	
	public boolean authenticateUser(Users user)
	{
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count = 0;
		String url = "jdbc:mysql://localhost:3306/st";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","S@iee918");
			pst = con.prepareStatement("select count(*) from users where username=? and password=?");
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			
			rs = pst.executeQuery();
			if(rs.next())
			{
				count = rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count == 1;
		
		
	}
	
	public ArrayList<Purchases> getUserTransactions(String username)
	{
		ArrayList<Purchases> pList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/st";
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","S@iee918");
			pst = con.prepareStatement("select * from purchases where username=?");
			
			pst.setString(1,username);
			
			rs = pst.executeQuery();
			while(rs.next())
				pList.add(new Purchases(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getDouble(4)));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return pList;
	}

}
