package com.xworkz.app.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DbConfiguration {
	
	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource) {
		
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		
		bean.setPackagesToScan("com.xworkz.app");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(dataSource);
		
		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("Hibernate.show_sql", true);
		jpaProperties.put("Hibernate.format_sql", true);
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");
	
		bean.setJpaPropertyMap(jpaProperties);	
		return bean ;
	}
	
	@Bean
	public DataSource datasource() {
		System.out.println("calling DataSource");
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/xworkz");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("9663459862");		
		
		return driverManagerDataSource;
		
	}

}
