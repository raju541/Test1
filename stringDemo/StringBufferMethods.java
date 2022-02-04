package com.cts.stringDemo;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("rajan");
		
		System.out.println(sb.append("krishna"));		// rajankrishna
		System.out.println(sb.insert(1, "aa"));		// raaajankrishna
		System.out.println(sb.replace(1, 12, "bb"));	// rbbna
		System.out.println(sb.delete(1, 3));			// rna
		System.out.println(sb.reverse());				// anr
		System.out.println(sb.capacity());				// 21
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());				// 44  {(21*2)+2}
		sb.ensureCapacity(120);
		System.out.println(sb.capacity());				// 120
		
	}

}
