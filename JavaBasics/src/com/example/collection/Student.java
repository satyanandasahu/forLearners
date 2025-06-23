package com.example.collection;

import java.util.Date;

public class Student implements Comparable {
	
	private Integer studentId;
	private String name;
	private Date dob;
	private String gender;
	private String branch;
	private Integer age;
	
	
	
		/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}



		/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}



	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}



	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}



	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}



	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}



	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}



	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}


	/*
	 * ■ Negative If thisObject < anotherObject
■ Zero If thisObject == anotherObject
■ Positive If thisObject > anotherObject
	 */
	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		//if (object instanceof Student )
			return this.getStudentId().compareTo(((Student)object).getStudentId()) ;
		//return 
	}


	
	

}
