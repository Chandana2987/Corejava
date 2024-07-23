package com.tnsif.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("rohini");
	al.add("guhani");
	al.add("ramya");
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}
}
