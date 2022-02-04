package com.cts.thread;

public class TestDeadlockExample1 implements Runnable {
	 
	 
	@Override
	public void run() {
		  Dedlockex dx=new Dedlockex();
        synchronized (dx.resource2) {  
          System.out.println("Thread 2: locked resource 2");  
  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (dx.resource1) {  
            System.out.println("Thread 2: locked resource 1");  
          }  
        }  
      
		// TODO Auto-generated method stub
		
	}  
	
	
	public static void main(String[] args) {
		 Dedlockex dx1=new Dedlockex();
		 
		 Thread t1=new Thread(dx1);
		 
		 
		 TestDeadlockExample1 testDeadlockExample1=new TestDeadlockExample1();
		 Thread t2=new Thread(testDeadlockExample1);
		 
		 t1.start();
		 t2.start();
	}
	
}  

