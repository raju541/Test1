package com.cts.test;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1=Singleton.getSingleton();
		Singleton s2=Singleton.getSingleton();
		
		if(s1==s2) {
			System.out.println("Singleton");
		}
		else {
			System.out.println("Not a Singleton");
		}
	}

}
