package firstapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//to read UI data we use HttpservletRequest 
		
	   String firstName = req.getParameter("firstname");
	   String lastName = req.getParameter("lastname");
	   
	   System.out.println("-----First Name------"+firstName);//firstname is given in index.jsp as value 
	   System.out.println("-----Last Name------"+lastName);//lastname is given in index.jsp as value
	   
	   //to display as response in client
	   resp.getWriter().print("<h1>WELCOME "+firstName+" "+lastName+"XWORKZ</h1>");
	}

}
