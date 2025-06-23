package com.example.polymorphism;

import java.util.List;

public interface Employee {
	
	public EmployeeBean getEmployeeDetails(String employeeId);
	public String getEmployeeSalary(String employeeId);
	public String getEmployeeDesignation(String employeeId);
	public List getEmployeeSalaryByEmployeeName(String employeeName);

}
