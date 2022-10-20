package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {

	public static void main(String[] args) {
		/*Airtel ar = new Airtel();
		ar.calling();
		ar.data();*/
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("simbean.xml");
         
		Airtel ar = ap.getBean("sim",Airtel.class);
				ar.calling();
		    ar.data();
	}

}
