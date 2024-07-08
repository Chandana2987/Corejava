package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.err.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your cil");
		int id=sc.nextLine();
		System.out.println("enyter your caddress");
		String add=sc.nextLine();
		Customer c= new Customer();
		c.setCname(name);
		c.setCid(id);
		c.setCaddress(add);
		System.out.println(c);
		boolean  out=c instanceof Customer;
		System.out.println(c);
		
	}

}
