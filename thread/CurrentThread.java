package com.cts.thread;

public class CurrentThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentThread t1=new CurrentThread();
		CurrentThread t2=new CurrentThread();
		t1.start();
		t2.start();
	}

}
