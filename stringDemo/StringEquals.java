package com.cts.stringDemo;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("satish");
		String s2=new String("satish");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		StringBuffer s3=new StringBuffer("abc");
		StringBuffer s4=new StringBuffer("abc");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.toString().equals(s4.toString()));//true

	}

}
