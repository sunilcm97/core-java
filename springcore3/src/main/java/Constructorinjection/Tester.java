package Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("constructorinjection.xml");
       System.out.println("----------------------------------");
       
       Person devi=(Person) ap.getBean("devraj");
       devi.displayPerson();
       System.out.println("-------------------------------------------------------------");
       
       Car i20= (Car) ap.getBean("i20");
       i20.displayCar();
      System.out.println("-------------------------------I20--------------------------------");
      
      Car bmw= (Car) ap.getBean("bmw");
      bmw.displayCar();
     System.out.println("-------------------------------BMW--------------------------------");
      
      
       
	}

}
