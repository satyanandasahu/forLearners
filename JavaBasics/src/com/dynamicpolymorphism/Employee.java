package com.dynamicpolymorphism;

public class Employee implements Person {

	@Override
	public String getGender() {
		
		return "male";
	}
	
	@Override
	public String getMaritalStatus() {
		
		return "married";
	}

	@Override
	public String getDOB() {
		// TODO Auto-generated method stub
		return "24/04/1983";
	}

	@Override
	public String getPersonDetails() {
		// TODO Auto-generated method stub
		return "Name: Satyananda Sahu, Age: 42, Village: Bangore, Keonjhar"
				+ "Hometown: Keonjhar, Current Location: Bangalore";
	}

	@Override
	public String getPersonDetails(String name) {
		// TODO Auto-generated method stub
		return "Details by name: " + name;
	}

	@Override
	public String getPersonDetails(String name, int age) {
		// TODO Auto-generated method stub
		return "Details by name: " + name + "and " + age;
	}

	@Override
	public String getPersonDetails(Long personID) {
		// TODO Auto-generated method stub
		return "Details by Person ID: " + personID;
	}
	
	
	public String getEmployeeDetails(String name) {
		// TODO Auto-generated method stub
		return "Employee Details based on name: " + name;
	}

	public String getEmployeeDetails(Long personID) {
		// TODO Auto-generated method stub
		return "Employee Details based on personID: " + personID;
	}

	public String getEmployeeDetails(String name, int age) {
		// TODO Auto-generated method stub
		return "Emploee Details based on name: " + name + " and age: " + age;
	}
	
	public String getAEmployeeSalary(Long personID) {
		return "Employeee: Employee Salary";
	}

}
