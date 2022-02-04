package com.cts.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String res=ReverseString.reverse(s);
		System.out.println(res);
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
		return sb.toString();
	}

}

