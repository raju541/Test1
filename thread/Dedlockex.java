package com.cts.thread;

public class Dedlockex  implements Runnable
{
	final String resource1 = "ratan jaiswal";  
    final String resource2 = "vimal jaiswal";  


	@Override
	public void run() {
		// TODO Auto-generated method stub
		 synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  
	  
	           try { Thread.sleep(100);} catch (Exception e) {}  
	  
	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	}

}
}