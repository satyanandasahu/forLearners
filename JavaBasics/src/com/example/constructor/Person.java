package com.example.constructor;

public class Person {
	
	public Person() {
		System.out.println("Default Constructor");
	}
	
	public Person(String name) {
		System.out.println("Parmetrised Constructor " + name);
		this.name = name;
	}
	
	
	public Person(String name, String gender, String age, String height, String personId) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.personId = personId;
	}

	public static Person getPersonObject() {
		return new Person();
	}
	
	
	
	private String name;
	private String gender;
	private String age;
	private String height;
	private String personId;
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
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return the personId
	 */
	public String getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	

}
