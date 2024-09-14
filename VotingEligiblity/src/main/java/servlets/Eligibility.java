package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Eligibility() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String name = request.getParameter("name");
		String Age = request.getParameter("age");
		int age = Integer.parseInt(Age);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(age < 18)
		{
			out.println(name+" , you are not eligible");
			//response.sendRedirect("dashboard.html");
		}
		else
		{
			out.println("You are Eligible");
		}
	}

}
