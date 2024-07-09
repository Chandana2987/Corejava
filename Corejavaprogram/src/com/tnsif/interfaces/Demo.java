package com.tnsif.interfaces;

public class Demo implements Child{

	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void print() {
		System.out.println("print");
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
		d.print();
	}
}
