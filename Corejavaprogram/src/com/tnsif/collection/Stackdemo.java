package com.tnsif.collection;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer> ();
		ob.push(6);
		ob.push(7);
		ob.push(4);
		ob.push(3);
		ob.push(8);
		System.out.println("stack elements"+ob);
		System.out.println(ob.peek());
		if(ob.isEmpty())
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println("stack is not empty");
		}
		System.out.println(ob.search(7));
	}

}
