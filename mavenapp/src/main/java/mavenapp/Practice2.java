package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "9663459862";
		 
	Connection con = null;
		
		try {
			Connection con1 = DriverManager.getConnection(url,userName,pwd);
			Statement st = con1.createStatement();
			
			ResultSet rs = st.executeQuery("select Id,name,dep,shift from xworkz.mypol ");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + "-----"+rs.getString("name")+"-----"+rs.getString("dep")+"-------"+rs.getString("shift"));
				
			}
			
			con1.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		

	}

}
