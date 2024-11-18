package com.saiee.webmvc.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.saiee.webmvc.dto.Users;

@Repository
public class UsersDao 
{
	
    public boolean autheticateUser(Users user)
    {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url="jdbc:mysql://localhost:3306/st";
        int count = 0;
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con = DriverManager.getConnection(url,"root","S@iee918");
        	pst = con.prepareStatement("select count(*) from users where username=? and password=?");
        	pst.setString(1, user.getUsername());
        	pst.setString(2, user.getPassword());
        	rs = pst.executeQuery();
            if(rs.next())
               count = rs.getInt(1);	
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		if(rs!=null) rs.close();
        		if(pst!=null) pst.close();
        		if(con!=null) con.close();
        	}catch(Exception ex)
            {
            	ex.printStackTrace();
            }
        }
        return count == 1;
    }
    
    public double findBalance(String username)
    {
    	Connection con = null;
    	PreparedStatement pst = null;
    	ResultSet rs = null;
    	String url="jdbc:mysql://localhost:3306/st";
    	double balance = 0.0;
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection(url,"root","S@iee918");
    		pst = con.prepareStatement("select amount from usersaccount where username=?");
    		pst.setString(1, username);
    		rs = pst.executeQuery();
    		if(rs.next())
    			balance = rs.getDouble(1);
    	}
    	catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		if(rs!=null) rs.close();
        		if(pst!=null) pst.close();
        		if(con!=null) con.close();
        	}catch(Exception ex)
            {
            	ex.printStackTrace();
            }
        }
    	return balance;
    }
    public boolean transferAmount(String username,double amount)
    {
    	String url="jdbc:mysql://localhost:3306/st";
    	Connection con = null;
    	PreparedStatement pst = null;
    	int count = 0;
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection(url,"root","S@iee918");
    		pst = con.prepareStatement("update usersaccount set amount = amount - ? where username=?");
    		pst.setDouble(1, amount);
    		pst.setString(2, username);
    		count = pst.executeUpdate();
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    		  if(pst!=null) pst.close();
    		  if(con!=null) con.close();
    		}
    		catch(Exception ex)
    		{
    			ex.printStackTrace();
    		}
    	}
    	return count == 1;
    }
    public ArrayList<String[]> getTransactionsByUsername(String username)
	{
		ArrayList<String[]> tList = new ArrayList<>();
		Connection con=null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/st";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","S@iee918");
			pst = con.prepareStatement("select * from transactions where account_no = (select account_no from usersaccount where username=? )");
			pst.setString(1, username);
			rs = pst.executeQuery();
			while(rs.next())
				tList.add(new String[] {rs.getString(2),rs.getString(3),rs.getString(4)});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return tList;
		
	}

	
}
