package com.bs.bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bs.bookshop.dto.Users;


@Repository
public class UserDao 
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
	 	public ArrayList<String[]> getBooks()
		{
			ArrayList<String[]> bList = new ArrayList<>();
			Connection con=null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			String url = "jdbc:mysql://localhost:3306/st";
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,"root","S@iee918");
				pst = con.prepareStatement("select * from books");
				rs = pst.executeQuery();
				while(rs.next())
					bList.add(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return bList;
			
		}
	 	public ArrayList<String> getAllCategories()
	 	{
	 	    ArrayList<String> categoryList = new ArrayList<>();
	 	    Connection con = null;
	 	    PreparedStatement pst = null;
	 	    ResultSet rs = null;
	 	    String url = "jdbc:mysql://localhost:3306/st";
	 	    try
	 	    {
	 	        Class.forName("com.mysql.cj.jdbc.Driver");
	 	        con = DriverManager.getConnection(url, "root", "S@iee918");
	 	        pst = con.prepareStatement("SELECT DISTINCT Category FROM books");
	 	        rs = pst.executeQuery();
	 	        while (rs.next()) {
	 	            categoryList.add(rs.getString(1));
	 	        }
	 	    }
	 	    catch (Exception e)
	 	    {
	 	        e.printStackTrace();
	 	    }
	 	    return categoryList;
	 	}
	 	public ArrayList<String[]> getBooksByCategory(String category)
		{
			ArrayList<String[]> bList = new ArrayList<>();
			Connection con=null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			String url = "jdbc:mysql://localhost:3306/st";
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,"root","S@iee918");
				pst = con.prepareStatement("select * from books where Category = ?");
				pst.setString(1, category);
				rs = pst.executeQuery();
				while(rs.next())
					bList.add(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return bList;
			
		}
	 	public boolean buyBook(String title)
	 	{
	 	    Connection con = null;
	 	    PreparedStatement selectPst = null;
	 	    PreparedStatement updatePst = null;
	 	    ResultSet rs = null;
	 	    String url = "jdbc:mysql://localhost:3306/st";
	 	    boolean success = false;

	 	    try
	 	    {
	 	        Class.forName("com.mysql.cj.jdbc.Driver");
	 	        con = DriverManager.getConnection(url, "root", "S@iee918");
	 	        selectPst = con.prepareStatement("SELECT Copies FROM books WHERE Title = ?");
	 	        selectPst.setString(1, title);
	 	        rs = selectPst.executeQuery();

	 	        if (rs.next()) {
	 	            int copies = rs.getInt("Copies");
	 	            if (copies > 0) {
	 	                updatePst = con.prepareStatement("UPDATE books SET Copies = Copies - 1 WHERE Title = ?");
	 	                updatePst.setString(1, title);
	 	                int rowsUpdated = updatePst.executeUpdate();
	 	                if (rowsUpdated > 0) {
	 	                    success = true;
	 	                }
	 	            }
	 	        }
	 	    }
	 	    catch (Exception e)
	 	    {
	 	        e.printStackTrace();
	 	    }

	 	    return success;
	 	}



}
