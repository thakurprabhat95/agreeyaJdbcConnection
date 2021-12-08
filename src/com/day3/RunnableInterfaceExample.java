package com.day3;

public class RunnableInterfaceExample implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+",exceuting run() method..");
		
	}

}
