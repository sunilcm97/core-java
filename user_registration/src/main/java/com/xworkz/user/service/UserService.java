package com.xworkz.user.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.DTO.User;
import com.xworkz.user.util.EntityManagerUtil;

public class UserService implements UserI {
	
	EntityManagerUtil entityManagerUtil = new EntityManagerUtil();

	@Override
	public void saveUser(User user) {
		
		EntityTransaction entitytransaction = entityManagerUtil.getEntityManager().getTransaction();
		entitytransaction.begin();
		entityManagerUtil.getEntityManager().persist(user);
		entitytransaction.commit();
		entityManagerUtil.getEntityManager().close();
		
	}

	@Override
	public User findUserById(int userId) {
		
		return null;
	}

	@Override
	public void deleteUserById(int userId) {
		
		
	}

	@Override
	public User loginUser(String email, String password) {
		
		return null;
	}

	@Override
	public User updateUser(User user) {
		
		return null;
	}
	   public User findByUserEmail(String email) {
	    	 
	    	Query query =  entityManagerUtil.getEntityManager().createNamedQuery("findByEmail");
	    	
	    	query.setParameter("email", email);
	    	
	    	//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    	//query.setParameter("Password", encoder.encode(password));
	    	 
	    	 List<User> listUser = query.getResultList();
	    	 System.out.println("-----------------count of list---------" +listUser.size());
	    	 
	    	 User retUser= null;
	    	 
	    	 for(User user : listUser) {
	    		 retUser=user;
	    	 }
	    	 return retUser;
	     }
}
















