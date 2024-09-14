package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public registerServlet()
    {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Connection con = null;
		PreparedStatement prst = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edtech?useSSL=false&serverTimezone=UTC","root","S@iee918");
			
			String sql =  "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
			
			prst = con.prepareStatement(sql);
			
			prst.setString(1, username);
			prst.setString(2, email);
			prst.setString(3, password);
			
			int row = prst.executeUpdate();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			if(row > 0)
			{
				 out.println("<h2>Registration successful!</h2>");
				 
	             response.sendRedirect("login.html");
			}
			else
			{
				out.println("<h2>Registration failed. Please try again.</h2>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
