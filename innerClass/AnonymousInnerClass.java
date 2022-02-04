package com.cts.innerClass;

abstract class Inner{
	
		public abstract void msg();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner in=new Inner() {

			@Override
			public void msg() {
				// TODO Auto-generated method stub
				System.out.println("AnonymousInnerClass");
			}
			
		};
		
		in.msg();
	}

}
