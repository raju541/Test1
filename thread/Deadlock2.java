package com.cts.thread;

public class Deadlock2 extends Thread{
	
	final String resource1 = "rajan";  
    final String resource2 = "hari";  
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (resource1) {
			System.out.println("Thread 1: locked resource 1");
		}
		try { Thread.sleep(100);} catch (Exception e) {}  
		  
        synchronized (resource2) {  
         System.out.println("Thread 1: locked resource 2");  
        }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deadlock2 t1=new Deadlock2();
		t1.start();
	}

}
