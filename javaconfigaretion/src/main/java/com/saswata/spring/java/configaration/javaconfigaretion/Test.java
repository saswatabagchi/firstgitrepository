package com.saswata.spring.java.configaration.javaconfigaretion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigaretion.class);
		//Employee e = (Employee) context.getBean(Employee.class);
		Employee e = (Employee) context.getBean("MyFileSystemBean");
		e.saveEmployee();

	}

}
