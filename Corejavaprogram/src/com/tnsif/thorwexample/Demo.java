package com.tnsif.thorwexample;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		Throwdemo d=new Throwdemo();
		try
		{
			d.display();
		}
		catch(IOException e)
		{
			System.out.println("caught the exception"+e);
		}
	}

}
