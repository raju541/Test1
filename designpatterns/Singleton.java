package com.cts.designpatterns;

public class Singleton {
	
		private static Singleton object=null;
		
		private Singleton() {	}
		
		public static Singleton getSingleton() {
			
			if(object==null) {
				synchronized(Singleton.class) {
					if(object==null) {
							object=new Singleton();
					}
				}
			}
			return object;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1=Singleton.getSingleton();
		Singleton s2=Singleton.getSingleton();
		if(s1==s2) {
			System.out.println("Singleton");
		}
		else {
			System.out.println("Not a Singleton");
		}
	}

}
