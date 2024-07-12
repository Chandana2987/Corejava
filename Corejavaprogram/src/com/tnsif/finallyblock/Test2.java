package com.tnsif.finallyblock;
//exception with no matching catch block
public class Test2 {
	public static void main(String[] args) {
		try
		{
			System.err.println(100/0);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("exception caught"+e.getMessage());
			
		}
		finally
		{
		System.out.println("exception not caught");
		
	}

}
}
