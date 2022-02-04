package com.cts.innerClass;

interface A{  
	  public void show();  
	  interface B{  
	  public void msg();  
	  }  
	}  

public class NestedInterface implements A.B{

	 public void msg(){
		 
		 System.out.println("Nested interface");
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A.B ab=new NestedInterface();  
		  ab.msg();
	}

}
