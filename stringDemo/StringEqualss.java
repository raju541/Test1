package com.cts.stringDemo;

public class StringEqualss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String s1="Rajan";  
		   String s2="Rajan";  
		   String s3=new String("Rajan");  
		   String s4="Rajesh";  
		   String s5=new String("Rajan"); 
		   String s6="RAJAN"; 
		   
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false 
		   System.out.println(s3.equals(s5));//true
		   System.out.println(s1.equals(s6));//false case sensitive
		   
		   System.out.println(s1==s2);//true  
		   System.out.println(s1==s3);//false  
		   System.out.println(s1==s4);//false 
		   System.out.println(s3==s5);//false
		   System.out.println(s1==s6);//false case sensitive		

	}

}
