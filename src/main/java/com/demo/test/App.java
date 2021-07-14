package com.demo.test;

import com.demo.test.bean.Employee;
import com.demo.test.serviceimpl.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "John Disoza", "Software Engineer", "Pune");

		Employee employee2 = new Employee(102, "Abc", "Java Developer", "Banglore");

		Employee employee3 = new Employee(103, "Murali", "Software Engineer", "Hyd");

		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

		employeeServiceImpl.addEmployee(employee1);

		employeeServiceImpl.addEmployee(employee3);

		employeeServiceImpl.deleteEmployee(employee2);

		employee1.setEmployeeDesignatation("Oracle Developer");

		employeeServiceImpl.updateEmployee(employee1);
		
	}
}
