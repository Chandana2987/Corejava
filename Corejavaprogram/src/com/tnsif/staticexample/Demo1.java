package com.tnsif.staticexample;

public class Demo1 {

	public static void main(String[] args) {
		Student.change();
		Student s=new Student(534,"chandana");
		Student s2=new Student(535,"chandana");
		Student s3=new Student(536,"chandana");
		s.display();
		s2.display();
		s3.display();
		
	}
}
