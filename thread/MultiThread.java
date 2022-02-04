package com.cts.thread;

public class MultiThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread t=new MultiThread();
		t.start();
	}

}
