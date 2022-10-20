package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSelectQuery_Execute {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String address = sc.nextLine();
		String rollno = sc.nextLine();
		int id = sc.nextInt();
		
		
		
		String selectSQL ="SELECT   id,name,address,rollno from xworkz.student";
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "9663459862";
		
		//step2
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, pwd);
			
			//step3
			Statement st = con.createStatement();
			Boolean res = st.execute(selectSQL);
			System.out.println("--------boolean Value-----"+res);
			
			if(res==true)
			{
				
			
			
			          ResultSet rs = st.executeQuery(selectSQL);
			          while(rs.next()) {
			        	  System.out.print("Student ID:"   +rs.getInt(1));
			        	  System.out.print("Student Name:"+rs.getString("name"));
			        	  System.out.print("Student rollno"+rs.getString("rollno"));
			        	  System.out.println("Student address"+rs.getString("address"));
			          }
			}
			else {
				System.out.println("-----DML Query-------");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
