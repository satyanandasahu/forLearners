package com.example.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AEmployee implements Employee {

	@Override
	public EmployeeBean getEmployeeDetails(String employeeId) {
		// TODO Auto-generated method stub
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
		
		//salary fetch from db
		if ("AM1248781381".equals(employeeId))
			return "*******";
			
		return "EmployeeId Not Found";
	}

	@Override
	public String getEmployeeDesignation(String employeeId) {
		//fetch from db
		if ("AM1248781381".equals(employeeId))
			return "Senior Engineering Manager";
		
		return "EmployeeId Not Found";
	}

	@Override
	public List getEmployeeSalaryByEmployeeName(String employeeName) {
		
		List employeeList = new ArrayList();
		
		//fetch from
		if ( employeeName.contentEquals("ABC") ) {
			EmployeeBean employeeBean = new EmployeeBean();
			employeeBean.setEmployeeName("FABCE");
			employeeBean.setEmployeeSalary("*******");
			employeeList.add(employeeBean);
			employeeBean = new EmployeeBean();
			employeeBean.setEmployeeName("FSABCETY");
			employeeBean.setEmployeeSalary("*******");
			employeeList.add(employeeBean);
		}
		
		
		return employeeList;
	}

	
	public String getEmployeeAge(String employeeId) {
		//fetch from db
		if ("AM1248781381".equals(employeeId))
			return "43";
		
		return "EmployeeId Not Found";
	}
	
}
