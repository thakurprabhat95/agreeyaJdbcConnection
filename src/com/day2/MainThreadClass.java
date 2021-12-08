package com.day2;

public class MainThreadClass {
	public static void main(String[] args) {
		
		Thread thread=new Thread(new ThreadImplemtsByRunnable());
		thread.start();
	}

}
