package com.cts.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Externalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(102,"Chandu");
		Employee emp1=null;
		try {					//Serialization
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Dell\\Documents\\file1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp);
		out.flush();
		out.close();
		fout.close();
		}
		catch(Exception e) {	System.out.println(e);	}
		
			try {				//Deserialization
			FileInputStream fin=new FileInputStream("C:\\Users\\Dell\\Documents\\file1.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			emp1=(Employee)in.readObject();
			in.close();
			fin.close();
			}
			catch(Exception e) {	System.out.println(e);	}
			
		System.out.println("Converting Object into Byte-Stream is Success");
		System.out.println(emp1.id+" "+emp1.name);
	}
}
