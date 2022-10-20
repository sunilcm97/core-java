package Constructorinjection;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private List<Car> listofcars;
	public Person(int id, String name, List<Car> listofcars) {
		super();
		this.id = id;
		this.name = name;
		this.listofcars = listofcars;
	}
	
	public void displayPerson() {
		System.out.println("Id:  "+this.id);
		System.out.println("Name:  "+this.name);
		System.out.println("List Car:  "+this.listofcars);
	
		
	}

}
