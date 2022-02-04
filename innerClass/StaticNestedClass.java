package com.cts.innerClass;

public class StaticNestedClass {
	
	private static int data=10;
	
		static class Nested{
			
			static void msg() {
				System.out.println("data is "+data);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClass.Nested sn=new StaticNestedClass.Nested();
		sn.msg();
		
		StaticNestedClass.Nested.msg();
	}

}
