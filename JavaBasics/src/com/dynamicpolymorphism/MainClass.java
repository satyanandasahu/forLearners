package com.dynamicpolymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		//Object
		
		/*
		 * for(int i=0; i<1000; i++ ) { Person emp = new AEmployee(); }
		 */

		// Creating an object of class AEmployee using interface type declaration.
		// Parent Class reference variable and child class object
		Person employeeAI = new AEmployee();
		System.out.println("object id" + employeeAI);
		System.out.println("Person DOB using Person type variable" + employeeAI.getDOB());
		
		AEmployee emp  = ((AEmployee)employeeAI);
		System.out.println("*******" + emp.getAEmployeeSalary(9237430924730927l));
		
		
		

		// Creating an object of class AEmployee using abstract class type declaration.
		// Parent Class reference variable and child class object
		Employee employeeAAC = new AEmployee();
		System.out.println(
				"Employee Details using employee type variable" + employeeAAC.getEmployeeDetails(9732482346648347l));
		System.out.println("Person marital status using employee type variable");

		// Creating an object of class AEmployee using class type declaration.
		// Reference variable and object class are same
		AEmployee employeeAC = new AEmployee();
		System.out.println(
				"Employee Details using employee type variable" + employeeAC.getEmployeeDetails(9732482346648347l));
		System.out.println("Person marital status using employee type variable" + employeeAC.getMaritalStatus());
		System.out.println(
				"Employee Salary using aemployee type variable" + employeeAC.getAEmployeeSalary(8742389472378l));

		
		Employee empl = new Employee();
		Person per = (Person)empl;
		System.out.println("$$$$$$$$"+empl.getAEmployeeSalary(82374827l));
		
		//try {
		if ( per instanceof AEmployee ) {
			AEmployee aempl = (AEmployee)per;
			System.out.println("######" + aempl.getAEmployeeSalary(927497234l));
			System.out.println("%%%%%%%%%"+aempl.get());
		} else if ( per instanceof Employee ){
			Employee aempl = (Employee)per;
			System.out.println();
		}
	//	} catch(Exception e) {
		//	System.out.println("Hello My Dear Learners");
	//	}
		
		
		
		
		Person person = new AEmployee();
		Employee empe  = ((AEmployee)person);
		System.out.println("@@@@@@"+empe.getAEmployeeSalary(238764283642l));
		
		
		
	}

}
