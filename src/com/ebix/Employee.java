package com.ebix;

public class Employee implements Comparable<Employee> {
 
	 private int id;
	 private String name;
	 private int salary;
	 
	 public Employee() {
		 
	 }
	 public Employee(int id, String name, int salary) {
		 super();
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	 public int calculateSalary(int ta,int da, int hra) {
			return ta+da+hra; 
	 }
	 public float calculateSalary(float ta,float da) {
			return ta+da; 
	 }
	 public void printMessage() {
		System.out.println("Employee Class"); 
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
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
