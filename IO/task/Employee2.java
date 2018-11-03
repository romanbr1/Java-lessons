package ua.lviv.lgs.task;

import java.io.Serializable;


public class Employee2 implements Serializable {
	private int id;
	private String name;
	private transient int salary;

	public Employee2(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
