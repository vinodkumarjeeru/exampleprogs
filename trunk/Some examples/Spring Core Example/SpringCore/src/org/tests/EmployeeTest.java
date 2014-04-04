package org.tests;

import org.domain.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String args[]) {

		BeanFactory factory = new ClassPathXmlApplicationContext(
				new String[] {"beans.xml"});
		
		Employee employee = (Employee) factory.getBean("employee");
		System.out.println(employee);

		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext(
		// new String[] { "beans.xml" });
		// AppContext.CONTEXT = applicationContext;
		//
		//
		// Employee employee = (Employee)
		// AppContext.CONTEXT.getBean(ContextIdNames.EMPLOYEE);
		// Traveller traveller =
		// (Traveller)AppContext.CONTEXT.getBean("traveller");
		// traveller.startJourney();
		// System.out.println(employee);
		//

	}
}
