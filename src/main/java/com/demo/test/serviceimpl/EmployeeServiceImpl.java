package com.demo.test.serviceimpl;

import com.demo.test.bean.Employee;
import com.demo.test.daoImpl.EmployeeDaoImplementation;
import com.demo.test.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	
	EmployeeDaoImplementation employeeDaoimpl=new EmployeeDaoImplementation();
	
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoimpl.addEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoimpl.updateEmployee(employee);
		
	}

	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employeeDaoimpl.deleteEmployee(employee);
		
	}

}
