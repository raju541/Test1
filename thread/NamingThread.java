package com.cts.thread;

public class NamingThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingThread t1=new NamingThread();
		NamingThread t2=new NamingThread();
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
		System.out.println("id of t1: "+t1.getId() );
		System.out.println("id of t2: "+t2.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("Rajan");
		t2.setName("Hari");
		System.out.println("After changing name of t1: "+t1.getName());
		System.out.println("After changing name of t2: "+t2.getName());		

	}

}
