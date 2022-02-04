package com.cts.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateString {

	public static void findDuplicate(String word) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] ch=word.toCharArray();
		for (char c : ch) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println(map);
		Set<Map.Entry<Character,Integer>> set=map.entrySet();
		for (Map.Entry<Character, Integer> entry : set) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicate("aaabbcdde");
	}
}
