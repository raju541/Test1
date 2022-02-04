package com.cts.thread;

public class MultiThread1 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThread1 mt=new MultiThread1();
		
		Thread t=new Thread(mt);
		t.start();

	}

}
