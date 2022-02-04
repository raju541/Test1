package com.cts.thread;

public class ThreadTwice extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwice t1=new ThreadTwice();
		t1.start();
		t1.start();
	}

}
