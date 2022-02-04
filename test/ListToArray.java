package com.cts.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("raju");
		list.add("hari");
		list.add(null);
		System.out.println("Converting List to Array:");
		int size=list.size();
		String[] str=new String[size];
		String[] item=list.toArray(str);
		for (String string : item) {
			System.out.println(string);
			}
		System.out.println("Converting Array to List:");
		list=Arrays.asList(item);
		System.out.println(list);
		
	}

}
