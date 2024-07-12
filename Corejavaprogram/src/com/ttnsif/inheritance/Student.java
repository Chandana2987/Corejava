package com.ttnsif.inheritance;

public class Student extends Citizen{
 private int rolllno;
 private String collegename;
 public Student()
 {
	 System.out.println("welcome");
 }
public Student(int rolllno, String collegename) {
	this.rolllno = rolllno;
	this.collegename = collegename;
}

public Student(String name, long adhaarno, String address, int phoneno) {
	super(name, adhaarno, address, phoneno);
	
}

public int getRolllno() {
	return rolllno;
}
public void setRolllno(int rolllno) {
	this.rolllno = rolllno;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}

@Override
public String toString() {
	return super.toString()+"Student [rolllno=" + rolllno + ", collegename=" + collegename + "]";
}



 }
