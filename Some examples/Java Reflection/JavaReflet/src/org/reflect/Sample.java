package org.reflect;

public class Sample {

	private int id;
	private String name;

	private Employee employee;
	
	public Sample() {
		System.out.println("Sample - Default Constructor !");
	}

	public Sample(int id) {
		this.id = id;
		System.out.println("ID is : "+id);
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

	public void print() {
		System.out.println("This is Print Method !");
	}

	public String getMessage() {
		return "Welcome CMC !";
	}

	public void print(String message) {
		System.out.println("============" + message);
	}

	public void print(Integer id, String message) {
		System.out.println(id + "\t" + message);
	}
}
