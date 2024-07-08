package com.tnsif.constructor;

public class Customer {

	private String name ;
	private int id;
	private String add;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
  	
}
