package com.xworkz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.dto.Employee;
import com.xworkz.app.service.EmployeeService;

@Controller
//@RestController
public class EmployeeController {
	
	public EmployeeController() {
		System.out.println("-------------------------------------");
	}
	
	@Autowired
	EmployeeService service;
	
	//@RequestingMapping will get action name(url from UIpage)
	//Requestedmathod post post type request
	//@modelAttribute will bind UI(from) data to entity class(Employee.java)
	//modelandview is class that holds information
	//of both UI and model(that is employee data)
	
	@RequestMapping(value="save",method = RequestMethod.POST)
	 public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		 System.out.println("----------saveEmployee---------------"+this.getClass());
		 
		 Employee employee2 = service.save(employee);
		 System.out.println("---------------------------------");
		return new ModelAndView("welcome");
		 
	 }
	@RequestMapping("/searchname")
	public ModelAndView searchName(@RequestParam String firstname) {
		//@ModelAttribute will bind ui object to entity object
		System.out.println("-------searchName------1----"+firstname);

	List<Employee> lists=	service.searchByEmployeeFirstName(firstname);
	
	
	return new ModelAndView("show", "employees", lists);
	}

}
