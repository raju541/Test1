package com.cts.innerClass;

public class InnerClass {
	
		private int data=10;
		
		public class Inner{
			
			public void msg() {
				System.out.println("data is "+data);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass ic=new InnerClass();
		InnerClass.Inner in=ic.new Inner();
		in.msg();
	}

}
