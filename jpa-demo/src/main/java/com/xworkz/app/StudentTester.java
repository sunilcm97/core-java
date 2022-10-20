package com.xworkz.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTester {

	public static void main(String[] args) {
		
		Student st  = new Student();
		st.setId(12);
		st.setName("Umi");
		st.setAge(19);
		st.setHometown("Ballary");
		
		
		EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("student1_xworkz"); 
		EntityManager entityManager = entityFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(st);
		transaction.commit();
		entityManager.close();
		entityFactory.close();
	}

}
