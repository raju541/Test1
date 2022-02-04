package com.cts.stringDemo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=ReverseString.reverse("hello");
		System.out.println(s);	
		
		
//		  String str="string"; 
//		  char ch[]=str.toCharArray(); 
//		  for(int i=ch.length-1;i>=0;i--) { 
//			  System.out.print(ch[i]); }
		 
	}
		public static String reverse(String s)
		{
			StringBuilder sb=new StringBuilder();
			char ch[]=s.toCharArray();
			for(int i=(ch.length-1); i>=0; i--)
			{
				sb.append(ch[i]);
			}
			return sb.toString();
		}
	
		/*StringBuilder sb=new StringBuilder("Good Morning");
		sb.reverse();
		System.out.println(sb);*/
		
}