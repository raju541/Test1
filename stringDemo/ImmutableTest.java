package com.cts.stringDemo;

public class ImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Immutable i=new Immutable("abc");
		System.out.println(i.getName());
		
		System.out.println(i.getName().concat("def"));
		
		System.out.println(i.getName());
		
	}

}
