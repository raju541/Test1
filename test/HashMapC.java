package com.cts.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "raju");
		map.put(2, "hari");
		map.put(3, null);
		
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator<Entry<Integer,String>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> entry=itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		for(Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}

}
