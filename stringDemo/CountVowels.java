package com.cts.stringDemo;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aeiou";
		System.out.println("String is: "+s);
		int count=0;
		char ch[]=s.toCharArray();
		for (char c : ch) {
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				default:
			}
		}
		System.out.println("Vowels count is: "+count);
	}
}