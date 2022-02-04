package com.cts.stringDemo;

public class Mutables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);    //hellojava

		
		StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer);    //hellojava
        

	}

}
