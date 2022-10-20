package mavenapp;

import java.sql.*;


public class JdbcUpdate {

	public static void main(String[] args)  {
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String pwd="9663459862";
		Connection con=null;
	
		try {
			  //step1 local and reg the driver
			  //Its not required its loads
			//Automatically from
			//vendor DB jar(Mysql)
			
			Class.forName("com.mysql.jdbc.Driver");
			
			 con  = DriverManager.getConnection( url,userName,pwd);
			
			Statement st = con.createStatement();
			st.execute("Update xworkz.employee set  name ='sunil' where id =222" );
			
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
finally {
	try {
		con.close();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
	}

}
