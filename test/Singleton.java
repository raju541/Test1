package com.cts.test;

public class Singleton {
	
		private static Singleton object=null;
		
		private Singleton() {}
		
		public static Singleton getSingleton() {
			
			if(object==null) {
				synchronized(Singleton.class){
					if(object==null) {
						object=new Singleton();
					}
				}
			}
			return object;
		}

}
