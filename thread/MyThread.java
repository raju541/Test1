package com.cts.thread;

public class MyThread  extends Thread{

	
	@Override
		public void run() {
			// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			if(Thread.currentThread().getName().equals("thread1")){
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread());
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.setName("thread1");
		MyThread t1=new MyThread();
		t1.setName("thread2");
		t.start();
		t1.start();
	}

}
