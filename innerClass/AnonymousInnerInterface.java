package com.cts.innerClass;

interface Innerr{
	
		abstract void msg();
}

public class AnonymousInnerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Innerr in=new Innerr() {

			@Override
			public void msg() {
				// TODO Auto-generated method stub
				System.out.println("AnonymousInnerInterface");
			}
			
		};
		in.msg();
	}

}
