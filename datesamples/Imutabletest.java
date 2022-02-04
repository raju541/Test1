package com.cts.datesamples;

public class Imutabletest {
public static void main(String[] args) {
	Imutable imutable=new Imutable("prasad");
	String name=imutable.getName();
	name="abc";
	System.out.println(imutable.getName());
	
}
}
