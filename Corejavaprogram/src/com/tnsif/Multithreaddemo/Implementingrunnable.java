package com.tnsif.Multithreaddemo;

public class Implementingrunnable implements Runnable {

	
	public static void main(String[] args) {
		Implementingrunnable r=new Implementingrunnable();
	//	r.start(); we get error beacuse start() is present in thread class,hence we need to create thread object to use start() method.
		Thread d=new Thread();
		d.start();
		
		
	}
	public void run()
	{
		System.out.println("implementing runnable interface");
	}

}
