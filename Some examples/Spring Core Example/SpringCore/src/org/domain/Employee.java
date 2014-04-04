package org.domain;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private Date hireDate;
	private Address address;

	public Employee() {

	}
	
	

	public Employee(int id, String name, double salary, Date hireDate,
			Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", hireDate=" + hireDate + ", address=" + address + "]";
	}

}
