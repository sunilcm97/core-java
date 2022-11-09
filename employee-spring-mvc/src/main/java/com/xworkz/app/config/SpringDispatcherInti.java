package com.xworkz.app.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringDispatcherInti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	
	public SpringDispatcherInti() {
		System.out.println("--------------------------------SpringDispatcherInti----------------------");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("---------getRootConfigClass-------------------");
		return new Class[] {MvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("---------getServletConfigClass-------------------");
		
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String [] {"/"};
	}

}
