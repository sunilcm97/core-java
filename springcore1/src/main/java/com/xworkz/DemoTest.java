package com.xworkz;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		
		/*
		 *Applicationcontext is a sub interface of beanfactory
		 *its create object by reading spring bean xml(demo.xml)file
		 *applicationcontext will load xml file and will perform pre-instantiation
		 *spring always create  singleton  object for bean tag
		 */
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("demo.xml");
		System.out.println("--------after ApplicationContext------------------");
		   //getBean method will take argument as bean id and
		//return object created by ApplicationContext
		//always getBean will return Object class
		//we need downCast asper pojo class
		
	        Demo d = (Demo)	ap.getBean("d"); // pass id from xml
		  System.out.println("---------:Message"+d.getMsg());
       
	}

}
