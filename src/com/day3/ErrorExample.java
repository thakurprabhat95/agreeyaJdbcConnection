package com.day3;

public class ErrorExample {
	
	public static void recursiveMethod(int i)
	{
		while(i!=0)
		{
			i=i+1;
			recursiveMethod(i);
		}
	}
public static void main(String[] args) {
	
	try {
		
		//System.out.println(12/0);
	recursiveMethod(10);//it will throw java.lang.StackOverflowError
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}	

}
