package com.cts.test;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		StringBuilder sb=new StringBuilder(s);
		sb=sb.reverse();
		if(sb.toString().equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
