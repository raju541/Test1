package com.cts.innerClass;

	class C{  
	   
	  interface D{  
	  public void msg();  
	  }  
	}
public class NestedClassInterface implements C.D{
	
	public void msg(){
		 
		 System.out.println("Nested interface");
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.D cd=new NestedClassInterface();
		cd.msg();
	}

}
