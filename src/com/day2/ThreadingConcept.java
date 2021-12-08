package com.day2;

public class ThreadingConcept extends Thread {
	
	public void run()
	{
		try {
			
			//displaying the thread that is running
			System.out.println("Thread"+Thread.currentThread().getId());
			System.out.println("Thread"+Thread.currentThread().getName());
			
		} catch (Exception e) {
			//throwing an exception
			System.out.println("Exception is caught..");
			
			
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			ThreadingConcept threadingConcept=new ThreadingConcept();
			threadingConcept.start();
		}
	
	//getting refernece to main thread
	Thread thread=Thread.currentThread();
	
	//getting name of main thread
	System.out.println("Name of main thread..."+thread.getName());
	
	//changing the name of main thread
	
	thread.setName("PrabhatMain");
	System.out.println("Name of changed method.."+thread.getName());
	
	

}
}
