package org.tests;

import org.domain.Employee;
import org.utils.AppContext;

public class Test {

	public static void main(String[] args) {
       
		Employee employee = (Employee)AppContext.CONTEXT.getBean("employee");
	
	}

}
