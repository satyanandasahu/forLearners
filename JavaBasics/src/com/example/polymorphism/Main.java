package com.example.polymorphism;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	/*	Employee aEmployee = new AEmployee();	
		System.out.println("Get Employee Details : ");
		EmployeeBean employeeBean = aEmployee.getEmployeeDetails("AM1248781381");
		System.out.println("Employee Name: " + employeeBean.getEmployeeName());
		System.out.println("Employee Id: " + employeeBean.getEmployeeId());
		System.out.println("Employee Salary: " + employeeBean.getEmployeeSalary());
		System.out.println("Employee Type: " + employeeBean.getEmployeeType() );
		System.out.println("Employee Department: " + employeeBean.getDepartment());
		System.out.println("Employee Age: " + ((AEmployee)aEmployee).getEmployeeAge("AM1248781381"));
	*/
		
		Employee cEmployee1 = new CEmployee();
		BEmployee cEmployee2 = new CEmployee();
		CEmployee cEmployee3 = new CEmployee();
		
		EmployeeBean employeeBean = cEmployee2.getEmployeeDetails("AM1248781381");
		System.out.println("Employee Name: " + employeeBean.getEmployeeName());
		System.out.println("Employee Id: " + employeeBean.getEmployeeId());
		System.out.println("Employee Salary: " + employeeBean.getEmployeeSalary());
		System.out.println("Employee Type: " + employeeBean.getEmployeeType() );
		System.out.println("Employee Department: " + employeeBean.getDepartment());
		System.out.println("Employee Age: " + cEmployee2.getEmployeeAge("AM1248781381"));
		
	}

}
