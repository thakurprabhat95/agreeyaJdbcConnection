package com.day2;

 class ThreadImplemtsByRunnable implements Runnable {

	@Override
	public void run() {
		
		try {
			//displaying the thread that is running
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
			System.out.println("Thread" +Thread.currentThread().getName());
			
			System.out.println("Priority of thread is..."+Thread.currentThread().getPriority());
			System.out.println("hashcode value of thread is..."+Thread.currentThread().hashCode());
			System.out.println("check alive or not.."+Thread.currentThread().isAlive());
			System.out.println("check daemon or not..?"+Thread.currentThread().isDaemon());
			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().getStackTrace());
			
		} catch (Exception e) {
			//throwing an exception
			System.out.println("Exception is caught..");
			
		}
		
	}
	
	
	}
 
	
