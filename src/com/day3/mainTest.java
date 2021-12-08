package com.day3;

public class mainTest {

	public static void main(String[] args) {
		
		SuperConceptExample conceptExample=new SuperConceptExample();
		conceptExample.display();
		conceptExample.message();
		
		//creating thread object
		System.out.println("Main thread is :"+Thread.currentThread().getName());
		Thread thread=new Thread(new RunnableInterfaceExample());
		thread.start();
		
		
	}

}
