package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery {

	public static void main(String[] args) {
	 
		String selectSQL ="SELECT * FROM xworkz.employee";
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "9663459862";
		
		//step2
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, pwd);
			
			//step3
			Statement st = con.createStatement();
			
			//step4 always better to use executeQuery for non-DML query(i,e select query)
			//executeQuery will return ResultSet interface,ResultSet interface holds table data,
			// to check whether the table has records or not,we use Resultset.next();
			//if records are present than RS.next(); will return true else false
			//to get column data then we should
			//resultSet.getX(Index Number);X represent datatype ;
			
			          ResultSet rs = st.executeQuery(selectSQL);
			          while(rs.next()) {
			        	  System.out.println("ID:"   +rs.getInt(1));
			        	  System.out.println("----Name:"+rs.getString("name"));
			        	  System.out.println();
			          }
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
