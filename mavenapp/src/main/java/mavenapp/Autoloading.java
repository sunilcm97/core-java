package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Autoloading {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "9663459862";
		
		//step1 jvm looks for a file called 
		
		
		

		try {
			Connection con = DriverManager.getConnection(url, userName, pwd);

			// metadata means information of information
			// to get additional information about database,
			// then we use Connection.getMetadata() method

			System.out.println("---------DB--------------" + con.getMetaData().getDatabaseProductName());

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
