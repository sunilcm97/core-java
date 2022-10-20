
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.DTO.User;
import com.xworkz.user.service.UserService;

public class UserDao {
	public static void main(String[] args) {
		
		User raja = new User();
		raja.setAge(29);
		raja.setEmail("raja2@gmail.com");
		raja.setName("raja2");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dob;
		try {
		dob =   dateFormat.parse("1998-02-22");
		raja.setDateofbirth(dob);
		
		}catch(ParseException e) {
			e.printStackTrace();
		}
		//Password encoding
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		raja.setPassword(encoder.encode("raja12345"));
		
		UserService userService = new UserService();
		System.out.println("-------------------------------Get User by email-----------------------");
		
		//userService.saveUser(raja);
		
		User user = userService.findByUserEmail("raja2@gmail.com");
				System.out.println("-------USER :-- "+user.toString());
		
	}

}
