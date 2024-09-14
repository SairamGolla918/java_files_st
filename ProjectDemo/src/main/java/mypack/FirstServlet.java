package mypack;

import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
import java.io.*;



public class FirstServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() 
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String user=request.getParameter("uname");
		String pass=request.getParameter("pass");
		out.println("username"+user+"password"+pass);
		
		
	}

}
