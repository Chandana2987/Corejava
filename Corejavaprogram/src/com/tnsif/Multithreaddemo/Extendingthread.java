package com.tnsif.Multithreaddemo;
//multithreading dem

public class Extendingthread extends Thread {

	public void run()  //running state
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Extendingthread e=new Extendingthread();
		e.start();//runnable state
	}

}
