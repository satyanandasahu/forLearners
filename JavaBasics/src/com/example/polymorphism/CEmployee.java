package com.example.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CEmployee extends BEmployee implements Employee  {

	@Override
	public List getEmployeeSalaryByEmployeeName(String employeeName) {
		List employeeList = new ArrayList();
		System.out.println("Inside CEmployee Class : getEmployeeSalaryByEmployeeName ");
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
		System.out.println("Inside CEmployee Class : getEmployeeAge ");
		if ("AM1248781381".equals(employeeId))
			return "44";
		
		return "EmployeeId Not Found";
	} 
	
	
	 @Override
		public EmployeeBean getEmployeeDetails(String employeeId) {
		 System.out.println("Inside CEmployee Class : getEmployeeDetails ");
		 EmployeeBean employeeBean = super.getEmployeeDetails(employeeId);
		 System.out.println("back from super class method");
		 employeeBean.setEmployeeSalary("x%*******");
			
		 return employeeBean;
		}


}
