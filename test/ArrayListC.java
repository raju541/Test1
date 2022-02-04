package com.cts.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListC {
	public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("raju");
	list.add("hari");
	list.add(null);
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	for(String s:list) {
		System.out.println(s);
		}
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
		}
	}
}
