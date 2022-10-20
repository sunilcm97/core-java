package studentDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.HosiptalDTO;
import dao.JDBCConnectionUtil;

public class SunilStudentDao {
	
	public void createStudentInformation() {
		String insertQuery = "insert into student1 values(?,?,?,?)";
		
		Connection connection = JDBCConnectionUtil.getConnection();
		
		
		try {
			StudentDTO st = new StudentDTO();
			
			st.setId(1);
			st.setName("Sunil");
			st.setRollNo("male");
			st.setAddress("Mysore");
					
			
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			  preparedStatement.setInt(1, st.getId());
			  preparedStatement.setString(2, st.getName());
			  preparedStatement.setString(3, st.getRollNo());
			  preparedStatement.setString(4, st.getAddress());
			  
			 
//step4 execute query
			int count = preparedStatement.executeUpdate();
			System.out.println("--------record inserted-------------" + count);
//step5 close connection object
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end of exception

	}//end method
		
		
	}


