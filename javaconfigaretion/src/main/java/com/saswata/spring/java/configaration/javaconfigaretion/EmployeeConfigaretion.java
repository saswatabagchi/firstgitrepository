package com.saswata.spring.java.configaration.javaconfigaretion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfigaretion {
	
	
	@Bean(name= {"getMyFileSystemBean","MyFileSystemBean"})
	public Employee employeeService () {
		return new Employee() ;
	}
	@Bean
	public Address addressService () {
		return new Address() ;
	}
	

}
