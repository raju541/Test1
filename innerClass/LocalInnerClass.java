package com.cts.innerClass;

public class LocalInnerClass {
	
		private static int data=10;
		
		public void msg() {
			
			 class Local{
				
				 public void display() {
					 System.out.println("data is "+data);
				 }
			}
			 Local l=new Local();
			 l.display();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass li=new LocalInnerClass();
		li.msg();
	}

}
