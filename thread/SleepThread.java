package com.cts.thread;

public class SleepThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		  
			    try{
			    	 for(int i=1;i<5;i++){
			    	Thread.sleep(500);
			    	System.out.println(i);
			    	 }
			    }
			    catch(InterruptedException e){
			    	System.out.println(e);
			    	}  
		}  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t1=new SleepThread();
		SleepThread t2=new SleepThread();
		t1.start();
		t2.start();
	}

}
