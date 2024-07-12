package com.tnsif.practice;

import java.util.Scanner;

public class Demo implements MainInterface.Interface {

	
	@Override
	public void display() {
		System.out.println("a: "+a);
}
public static void main(String[] args)
{
	Demo d=new Demo();
	d.display();
}
}