package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
public static void main(String[] args) {

	ApplicationContext ap = new ClassPathXmlApplicationContext("student.xml");
	
	Student st = (Student) ap.getBean("s");
	System.out.println("Id:"+st.getId());
	System.out.println("Name:"+st.getName());
	System.out.println("rollNo:"+st.getRollNo());
}
}
