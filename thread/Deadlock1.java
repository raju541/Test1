package com.cts.thread;

public class Deadlock1 {
	
	
	public synchronized void m1() {
	
		m2();
		System.out.println("m1 method");
	}

	public synchronized void m2() {
		
		m1();
		System.out.println("m2 method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deadlock1 t1=new Deadlock1();
		t1.m1();
		t1.m2();
	}

}
