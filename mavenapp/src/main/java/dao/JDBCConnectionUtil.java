package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionUtil {
	
	//private JDBCConnectionUtil connectionUtil;
	private static Connection connection;
	//assigmnet
	private JDBCConnectionUtil() {
	
	}
	
	static {
		try {
			//step1 load and register driver auto loading
			//step2 connection
			connection=DriverManager.getConnection(JDBCUtil.URL,JDBCUtil.USER,JDBCUtil.PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//return connection object
	public static Connection getConnection() {	
		return connection;//check for connection null or not
	}
}
