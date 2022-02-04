package com.cts.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fin=new FileInputStream("C:\\Users\\Dell\\Documents\\file.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student s=(Student)in.readObject();
		in.close();
		fin.close();
		System.out.println(s.id+" "+s.name);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
