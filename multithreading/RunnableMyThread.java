package com.cts.multithreading;

public class RunnableMyThread implements Runnable {
	
		public void run() {
			System.out.println("thread is running...");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableMyThread mythread=new RunnableMyThread();
		Thread thread=new Thread(mythread);
		thread.start();
	}

}
