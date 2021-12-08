package com.day2;

public class MainThreadAssigningPriorityExample {
	
	public static void main(String[] args) {
		//creating random threads with the help of class
		
	ThreadAssigningPriorityExample threadAssigningPriorityExample=new ThreadAssigningPriorityExample();
	ThreadAssigningPriorityExample threadAssigningPriorityExample1=new ThreadAssigningPriorityExample();
	ThreadAssigningPriorityExample threadAssigningPriorityExample2=new ThreadAssigningPriorityExample();
	
		 // Thread 1
        // Display the priority of above thread
        // using getPriority() method
		
		System.out.println(threadAssigningPriorityExample.getPriority());
		
		 // Thread 2
        // Display the priority of above thread
        // using getPriority() method
		
		System.out.println(threadAssigningPriorityExample1.getPriority());
		
		 // Thread 3
        // Display the priority of above thread
        // using getPriority() method
	
		System.out.println(threadAssigningPriorityExample2.getPriority());
		
		
		// Setting priorities of above threads by
        // passing integer arguments
       
		threadAssigningPriorityExample.setPriority(1);
		threadAssigningPriorityExample1.setPriority(8);
		threadAssigningPriorityExample2.setPriority(2);
		
		System.out.println(threadAssigningPriorityExample.getPriority());
		System.out.println(threadAssigningPriorityExample1.getPriority());
		System.out.println(threadAssigningPriorityExample2.getPriority());
		
		
		//check priority of main thread
		System.out.println("priority of main thread is...."+Thread.currentThread().getPriority());
		
		
		//we can change of priority of main thread
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority.."+Thread.currentThread().getPriority());
		
		threadAssigningPriorityExample.setPriority(6);
		threadAssigningPriorityExample1.setPriority(6);
        threadAssigningPriorityExample.start();	
        threadAssigningPriorityExample1.start();
		
	}

}
