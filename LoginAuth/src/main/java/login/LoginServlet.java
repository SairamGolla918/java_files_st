package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() 
    {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("UsernameOrEmail");
		String email = request.getParameter("UsernameOrEmail");
		String password = request.getParameter("password");
		
		Connection con = null;
		PreparedStatement prst = null;
		
		try 
		{
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edtech?useSSL=false&serverTimezone=UTC","root","S@iee918");
	
			String sql = "SELECT * FROM USERS WHERE (USERNAME=? OR EMAIL=?) AND PASSWORD=?";
			
			prst = con.prepareStatement(sql);
			prst.setString(1, username);
			prst.setString(2,email);
			prst.setString(3, password);
			
			ResultSet rs = prst.executeQuery();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			if(rs.next())
			{
				out.println("<h2>Login Suceesful..<h2>");
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("dashboard.html");
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
