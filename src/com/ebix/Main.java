package com.ebix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String []args) {
		Employee e1=new Employee(1,"Ravi",5000);
		Employee e2=new Employee(2,"Ajay",9000);
		Employee e3=new Employee(3,"Vishal",2000);
		Employee e4=new Employee(4,"Deepak",6000);
		Manager m1=new Manager(5,"Raja",9500,true);
		Manager employee = new Manager();
		employee.printMessage();
		Integer array[]= {5,2,3,1,10};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Collections.sort(Arrays.asList(array));
		System.out.println(Arrays.toString(array));
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		Collections.sort(employeeList);
		System.out.println(employeeList);
	}

}
