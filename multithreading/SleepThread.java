package com.cts.multithreading;

public class SleepThread extends Thread{
	
	public void run() {
		System.out.println("mythread");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("thread is running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread thread=new SleepThread();
		thread.start();

	}

}
