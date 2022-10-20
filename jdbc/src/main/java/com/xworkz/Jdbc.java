package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {

		// url to connect to mysql database
		// jdbc ------>main protocol
		// mysql------>sub protocol
		// ://localhost------>system name
		// (if we are connecting remote system then
		// in place of //localhost we need give
		// ip address of remote system
		// port----->mysql port number

		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "9663459862";

		// jdbc step
		// step1:load driver and register the driver

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// step2: create Connection

			Connection con = DriverManager.getConnection(url, username, pwd);

			// step3:Create ststement

			Statement st = con.createStatement();

			// step4
			st.execute("INSERT INTO" + " xworkz.employee values(222,'sunil','mysr')");

			// step5: closing should be in finally block

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
