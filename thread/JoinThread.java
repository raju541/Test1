package com.cts.thread;

public class JoinThread extends Thread{
	
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
		JoinThread t1=new JoinThread();
		JoinThread t2=new JoinThread();
		JoinThread t3=new JoinThread();
		t1.start();
		try {
			//t1.join();
			t1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
