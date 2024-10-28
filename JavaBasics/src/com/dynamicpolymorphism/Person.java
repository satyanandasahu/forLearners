package com.dynamicpolymorphism;

public interface Person {
	
	
	String getGender();
	String getDOB();
	String getMaritalStatus();
	String getPersonDetails();
	String getPersonDetails(String name);
	String getPersonDetails(String name, int age);
	String getPersonDetails(Long personID);
	

}
