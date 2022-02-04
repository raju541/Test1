package com.cts.stringDemo;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="12345";
		System.out.println("Given Number is: "+s);
		ReverseNum rn=new ReverseNum();
		String str=rn.reverse(s);
		System.out.println("Reverse of a number is: "+str);
	}

	public static String reverse(String s) {
		
		StringBuilder sb=new StringBuilder();
		char ch[]=s.toCharArray();
		for (int i = (ch.length-1); i >=0; i--) {
			sb.append(ch[i]);
		}
		return sb.toString();
	}

}
