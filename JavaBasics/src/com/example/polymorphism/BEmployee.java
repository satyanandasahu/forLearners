package com.example.polymorphism;

import java.util.ArrayList;
import java.util.List;

public abstract class BEmployee implements Employee{


	@Override
	public EmployeeBean getEmployeeDetails(String employeeId) {
		System.out.println("Inside BEmployee: getEmployeeDetais");
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmployeeName("Satyananda Sahu");
		employeeBean.setEmployeeId("AM1248781381");
		employeeBean.setDepartment("Technology Innovation");
		employeeBean.setEmployeeSalary("*******");
		// 1 is permanent, 2 is contractor
		employeeBean.setEmployeeType(1);
		return employeeBean;
	}

	@Override
	public String getEmployeeSalary(String employeeId) {
		System.out.println("Inside BEmployee: getEmployeeSalary");
		//salary fetch from db
		if ("AM1248781381".equals(employeeId))
			return "*******";
			
		return "EmployeeId Not Found";
	}

	@Override
	public String getEmployeeDesignation(String employeeId) {
		System.out.println("Inside BEmployee: getEmployeeDesignation");
		//fetch from db
		if ("AM1248781381".equals(employeeId))
			return "Senior Engineering Manager";
		
		return "EmployeeId Not Found";
	}

	
	public abstract List getEmployeeSalaryByEmployeeName(String employeeName); 
	
	public String getEmployeeAge(String employeeId) {
		//fetch from db
		System.out.println("Inside BEmployee: getEmployeeAge");
		if ("AM1248781381".equals(employeeId))
			return "43";
		
		return "EmployeeId Not Found";
	}
	

}
