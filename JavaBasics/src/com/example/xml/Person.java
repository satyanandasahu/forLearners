package com.example.xml;

public class Person {
    private String name;
    private int age;
	private String personId;
	private String gender;

    public Person() {}

    public Person(String name, int age, String personId, String gender ) {
        this.name = name;
        this.age = age;
		this.personId = personId;
		this.gender = gender;   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}