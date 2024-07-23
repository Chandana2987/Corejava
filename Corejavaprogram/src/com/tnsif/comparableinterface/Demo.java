package com.tnsif.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s=new Student(103,"rashmi","cse");
		al.add(s);
		s=new Student(108,"chandana","cse");
		al.add(s);
		 s=new Student(105,"pravalika","cse");
		al.add(s);
		System.out.println("Before Sorting  "+al);
		System.out.println("after sorting  "+al);
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
	}

}
