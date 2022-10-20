package com.xworkz.user.DTO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@NamedQuery(name = "findByEmail",query = "select u from User u where u.email =:email " )
//@NamedQueries()
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name = "ID")
	private int id;
	
	@Column(name = "EMAIL",unique = true,nullable = false,length = 100)
	private String email;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AGE")
	private int age; 
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "DOB")
	private Date dateofbirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", age=" + age + ", password=" + password
				+ ", dateofbirth=" + dateofbirth + "]";
	}
	

}
