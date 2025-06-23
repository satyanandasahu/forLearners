package com.example.mypackage.inheritance;

public class Employee extends Person {
	
	
	private String employeeId;
	private String employeeSalary;
	private String department;
	private int employeeType; 	// 1 represents permanent employee & 
								// 2 is for contractor
	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeSalary
	 */
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the employeeType
	 */
	public int getEmployeeType() {
		return employeeType;
	}
	/**
	 * @param employeeType the employeeType to set
	 */
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	
	
	

}
