package com.example.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return student1.getAge().compareTo(student2.getAge());
	}

	
}
