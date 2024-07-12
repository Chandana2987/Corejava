package com.tnsif.practice;

public class Child extends Father {
	void display()
	{
		System.out.println("child");

	}
	public static void main(String[] args) {
		{
			Child c=new Child();
			c.display();
			
		}
	}

}
