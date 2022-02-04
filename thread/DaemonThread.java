package com.cts.thread;

public class DaemonThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()) {			//checking for daemon thread 
			System.out.println("daemon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		DaemonThread t3=new DaemonThread();
		
		t1.setDaemon(true);						//t1 is daemon thread
		t2.setDaemon(false);					//t2 is not a daemon thread
		t1.start();
		t2.start();
		
		t3.start();
		t3.setDaemon(true);						//will throw IllegalThreadStateException here
	}

}
