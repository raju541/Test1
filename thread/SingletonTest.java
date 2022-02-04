package com.cts.thread;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instace1=Singleton.getInstance();
		Singleton instace2=Singleton.getInstance();
		
		System.out.println(instace1.hashCode());
		System.out.println(instace2.hashCode());
		
		System.out.println(instace1==instace2);
	}

}
