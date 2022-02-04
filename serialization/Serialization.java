package com.cts.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Student s1=new Student(101,"Rajan");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Dell\\Documents\\file.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
