package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setName("Raju");
		emp.setAddress("Hassan");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp_xworkz");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction entityTransaction = manager.getTransaction();

		entityTransaction.begin();

		manager.persist(emp);

		// get the data
		// Employee emp2 = manager.find(Employee.class, 7);
		// find method will get record from db where id is equal 2(internally jpa)
		// will generate select query (select * from emp where id=2)
		// if id is not present in table the find method will throw null pointer
		// exception
		// System.out.println("---------------" + emp2);

		// emp2.setAddress("jamu");

		// deleting record using remove method
		// for deleting record in table
		// first we need find the record by using find method by passing
		// primary key id
		// Employee removeemp = manager.find(Employee.class, 15);
		// manager.remove(removeemp);

		entityTransaction.commit();
		manager.close();
		factory.close();

		getAllEmployess();
		getEmployeeName();
	}

	public static void getAllEmployess() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp_xworkz");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction entityTransaction = manager.getTransaction();

		// entityTransaction.begin();

		Query qry = manager.createQuery("from Employee");
		qry.getResultList().forEach(e -> {
			System.out.println("emp:" + e.toString());
		});

		// entityTransaction.commit();
		manager.close();
		factory.close();

	}

	public static void getEmployeeName() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp_xworkz");
		EntityManager manager = factory.createEntityManager();

		// entityTransaction.begin();

		Query qry = manager.createQuery("select a.name from Employee a");
		qry.getResultList().forEach(e -> {
			System.out.println("emp:" + e.toString());
		});

		manager.close();
		factory.close();

	}

}
