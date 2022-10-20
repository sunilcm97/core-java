package secondapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String id = req.getParameter("id");
	Integer idint=Integer.parseInt(id);
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	
	String url = "jdbc:mysql://localhost:3306/xworkz";
	String userName = "root";
	String pwd = "9663459862";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection con = DriverManager.getConnection(url,userName,pwd);
		
		PreparedStatement pstmt = con.prepareStatement("insert into emp1 values(?,?,?,?) ");
		pstmt.setInt(1, idint);
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setString(4, password);
		
		int result = pstmt.executeUpdate();
		resp.getWriter().print("---emp1 data inserted...");
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	}
	

}
