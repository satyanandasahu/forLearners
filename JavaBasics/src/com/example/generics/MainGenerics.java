package com.example.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.collection.Employee;
import com.example.collection.Person;
import com.example.collection.Student;


public class MainGenerics {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		//List<Object> objectList = list;
		
		list.add("Satya");
		//objectList.add(44);
		list.add("Madhu");
	//	objectList.add((new Employee()));
		
/*		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String stringValue = iterator.next();
			System.out.println("fetch" + stringValue);
		}
		
		for (int i = 0; i < list.size(); i++) {
			String stringValue = list.get(i);
			System.out.println("value " + stringValue);
		}
		*/
		
		//Iterator<String> iterator = list.iterator()
		
		List<Student> lists = new ArrayList<Student>();
	//	lists.add("Satya");
	//	lists.add(44);
//		lists.add("Madhu");
		//lists.add((new Employee()));
		lists.add((new Student()));
	//	lists.add((new Person()));
	//	method(lists);
		
		Queue<String> employeeQueue = new Queue<String>(String.class);
		Employee employee = null;
		for (int i = 0; i < 21; i++) {
			//Student student = new Student();
			//student.setId("928342948" +i);
			
			employeeQueue.queue("_" + i);
		}
		
		for (int i = 0; i < 22; i++) {
			//employee = new Employee();
			//employee.setId("928342948" +i);
			//employeeQueue.queue(employee);
			employeeQueue.dequeue();
		}
		
		
		
		
		
	}
	
	
	public static void method(List<? super Student> objectList) {
		objectList.add(new Student());
		System.out.println("Print : " + objectList.get(1));
	}
	
	
	
	
	
}
