package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Example {
	
	//toString //hashcode //equals //Object
	public static void main(String[] args) {
		
	//	Example example = new Example();
	//	System.out.println(example);
	//	TestClass testClass = new TestClass();
	//	System.out.println(testClass);
		
	/*	Delegate delegate = new Delegate("283473284743", "Satya", 
				"43", "", "Software Technology","24 April 1983");
		
		Delegate delegate1 = new Delegate("283473284743", "Satyananda Sahu", 
				"43", "", "Software Engineering","24 April 1983");
		
		if ( delegate == delegate1)
			System.out.println("true");
		else
			System.out.println("false");
		
		if (delegate.equals(delegate1))
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("hashcode delegate" + delegate.hashCode());
		System.out.println("hashcode delegate1" + delegate1.hashCode());
		
		System.out.println(delegate);
		*/
		/*
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student = new Student();
		student.setStudentId(12);
		student.setAge(42);
		studentList.add(student);
		
		student = new Student();
		student.setStudentId(1);
		student.setAge(43);
		studentList.add(student);
		
		Delegate delegate = new Delegate();
		
		//studentList.add(delegate);
		
		System.out.println("displaying the arraylist in natural insertion order");
		for (Iterator iterator = studentList.iterator(); iterator.hasNext();) {
			Student stud = (Student) iterator.next();
			System.out.println(stud.getStudentId());
		}
		
		for (int i =0; i<studentList.size();i++) {
			Student stud = (Student) studentList.get(i);
			System.out.println(stud.getStudentId());
		}

		
		System.out.println("Displaying the arraylist in sorted order based on id");
		Collections.sort(studentList);
		for (Iterator iterator = studentList.iterator(); iterator.hasNext();) {
			Student stud = (Student) iterator.next();
			System.out.println(stud.getStudentId());
		}
		System.out.println("Displaying the arraylist in sorted order based on age");
		Collections.sort(studentList,new AgeComparator());
		for (Iterator iterator = studentList.iterator(); iterator.hasNext();) {
			Student stud = (Student) iterator.next();
			System.out.println(stud.getStudentId());
		} 
		
		*/
		
		Map<String,String> generalMap = new TreeMap<String,String>();
		generalMap.put("43","Satyananda Sahu");
		generalMap.put("21", "Hema Priya K");
		generalMap.put("20", "Gyanaranjan Mahanta");
		
		System.out.println("Value from map for id 43 - " + generalMap.get("43"));
		
		for (Map.Entry<String,String> entry : generalMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key: " + key + "  Value: " + val );
		}
		
		Iterator iterator = generalMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry)iterator.next();
		    System.out.println("Key: "+pair.getKey()+ " Value: " + pair.getValue());
		}	
		
	} 
}

class TestClass {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	//	return "Satya";
	}
	
}