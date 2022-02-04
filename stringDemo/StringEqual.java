package com.cts.stringDemo;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin"); 
		   String s4=new String("Sachin"); 
		   String s5 =s4.intern();
		/*
		 * System.out.println(s1.equals(s2));//true
		 * System.out.println(s1.equals(s3));//true
		 * System.out.println(s1.equals(s4));//true
		 * 
		 * System.out.println(s1==s2);//true 
		 * System.out.println(s1==s3);//false
		 * System.out.println(s1==s4);//false
		 */
		   System.out.println(s1==s2);//true
		   System.out.println(s2==s3);//false
		   System.out.println(s3==s4);//false
		   System.out.println(s2==s5);//true
		   System.out.println(s3==s5);//false
		   System.out.println(s1.equals(s2));//true
		   System.out.println(s4.equals(s5));//true
	}
}
