package com.dynamicpolymorphism;

public class AEmployee extends Employee {

	@Override
	public String getEmployeeDetails(String name) {
		// TODO Auto-generated method stub
		return "AEmployee: Employee Details based on name: " + name;
	}

	@Override
	public String getEmployeeDetails(Long personID) {
		// TODO Auto-generated method stub
		return "AEmployee: Employee Details based on personID: " + personID;
	}

	@Override
	public String getEmployeeDetails(String name, int age) {
		// TODO Auto-generated method stub
		return "AEmployee: Emploee Details based on name: " + name + " and age: " + age;
	}
	
	public String getAEmployeeSalary(Long personID) {
		return "AEmployee: Employee Salary";
	}
	
	public String get() {
		return "Java";
	}

	@Override
	public String toString() {
		return "AEmployee_" + "Satya";
	}

	
	
	
}
