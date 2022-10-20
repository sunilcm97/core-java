package DP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMe {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("mebean.xml");
		
		Me me = app.getBean("sunil",Me.class);
		System.out.println("name:"+me.getName());
		System.out.println("job  "+me.getB().getDesing());
		System.out.println("List of Govt Id:"+me.getListofId());

	}

}
