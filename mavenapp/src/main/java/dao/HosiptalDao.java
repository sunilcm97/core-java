package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class HosiptalDao {

	public void saveHosiptalInfomation() {
		
		// number of columns equal to number of ?(placeholder)
		String insertQuery = "insert into hosiptal values(?,?,?,?,?,?,?,?,?,?)";
		Connection connection = JDBCConnectionUtil.getConnection();
//step3:create PrepareStatement
		
		
			HosiptalDTO hs = new HosiptalDTO();
			
			hs.setId(404);
			hs.setPaitentName("yama");
			hs.setGender("male");
			hs.setRoomNo("105");
			hs.setPaitentPhone("9900292765");
			hs.setAddress("RRnagra");
			hs.setDoctorName("Rossy");
			hs.setAge("24");
			hs.setHosiptalName("Lanu");
			hs.setHosiptalAddress("Pune");		
			try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			  preparedStatement.setInt(1, hs.getId());
			  preparedStatement.setString(2, hs.getPaitentName());
			  preparedStatement.setString(3, hs.getGender());
			  preparedStatement.setString(4, hs.getRoomNo());
			  preparedStatement.setString(5, hs.getPaitentPhone());
			  preparedStatement.setString(6, hs.getAddress());
			  preparedStatement.setString(7, hs.getDoctorName());
			  preparedStatement.setInt(8,Integer.parseInt(hs.getAge()) );
			  preparedStatement.setString(9, hs.getHosiptalName());
			  preparedStatement.setString(10, hs.getHosiptalAddress());
			 
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

	public void getHosiptalInfomation() {

	}

	public void updateHosiptalInfomation() {

	}

	public void deleteHosiptalInfomation() {

	}
} 
