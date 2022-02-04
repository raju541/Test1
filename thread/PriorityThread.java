package com.cts.thread;

public class PriorityThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running thread name is: "+Thread.currentThread().getName());
		System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread t1=new PriorityThread();
		PriorityThread t2=new PriorityThread();
		PriorityThread t3=new PriorityThread();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}
