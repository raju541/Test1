package com.cts.stringDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="haihello";
		System.out.println("original string is: "+str);
		RemoveDuplicates rd=new RemoveDuplicates();
		rd.removedupli(str);
		
	}

	public void removedupli(String str) {
		
		Set<Character> set=new LinkedHashSet<Character>();
		System.out.print("After remove duplicates in a String is: ");
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			
		}
		for (Character character : set) {
			System.out.print(character);
		}
		
	}

}
