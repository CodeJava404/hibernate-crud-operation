package com.demo.test.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "emp_tble")

public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String employeeDesignatation;
	private String employeeLocation;

}