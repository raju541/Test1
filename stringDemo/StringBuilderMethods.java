package com.cts.stringDemo;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("rajan");
		
		System.out.println(sb.append("krishna"));		// rajankrishna
		System.out.println(sb.insert(1, "aa"));			// raaajankrishna
		System.out.println(sb.replace(1, 12, "bb"));	// rbbna
		System.out.println(sb.delete(1, 3));			// rna
		System.out.println(sb.reverse());				// anr
		System.out.println(sb.capacity());				// 21
		sb.append("rajan");
		System.out.println(sb.capacity());				// 44  {(21*2)+2}
		sb.ensureCapacity(120);
		System.out.println(sb.capacity());				// 120
		System.out.println(sb.charAt(2));	 			// r
		System.out.println(sb.length());				// 8
		System.out.println(sb.substring(5));			// jan
		
	}

}
