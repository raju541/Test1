package com.cts.multithreading;

public class MyThread extends Thread{
		
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();

	}

}
