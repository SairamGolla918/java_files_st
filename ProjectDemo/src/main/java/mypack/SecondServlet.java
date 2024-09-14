package mypack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public SecondServlet() 
    {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String d = getServletConfig().getInitParameter("Dev");
		String a = getServletConfig().getInitParameter("Ass");
		PrintWriter out = response.getWriter();
		out.println("Devloper name "+d);
		out.println("Associate name "+a);
		
			
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		
//		doGet(request, response);
//	}

}
