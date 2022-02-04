package com.cts.stringDemo;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		//String s="telugu";
		StringBuilder str = new StringBuilder(s);
		str = str.reverse();
		if (str.toString().equals(s)) {
		System.out.println(s+" is a palindrome");
		} 
		else {
			System.out.println(s+" is not a palindrome");
		}
	}

}
