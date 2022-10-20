package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "9663459862";
		
		
		
		
		
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//step2.create connection
				//connection is a interface in java.sql
				
				
					Connection con = DriverManager.getConnection(url,userName,pwd);
					//statement is a interface in java
					//it is used
					Statement st = con.createStatement();
					//its just exicute a query only dml queries
					//insert
					st.execute("insert into xworkz.mypol values(4239,'Prashanth','pd',7)");
					st.execute("insert into xworkz.mypol values(143,'sunil','pd',9)");
					st.execute("insert into xworkz.mypol values(124,'yama','pd',6)");
					
					//delete 
					//st.execute("delete from xworkz.mypol  where shift = 6");
					
					//update
					//st.execute("update xworkz.mypol set name = 'sunil' where id = 143 ");
					
					con.close();
					
					
			} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
			 catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			

	}
	}








