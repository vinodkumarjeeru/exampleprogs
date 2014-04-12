package org.model;

import java.util.HashSet;
import java.util.Set;

public class Employee {

	private int employeeId;
	private String employeeName;
	private Set<Mail> mailSet = new HashSet<Mail>();

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<Mail> getMailSet() {
		return mailSet;
	}

	public void setMailSet(Set<Mail> mailSet) {
		this.mailSet = mailSet;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", mailSet=" + mailSet + "]";
	}

}
