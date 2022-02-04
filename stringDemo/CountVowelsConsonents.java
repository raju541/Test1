package com.cts.stringDemo;

public class CountVowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefghijklmnopqrstuvwxyz";
		System.out.println("String is: "+s);
		int vowel=0,conso=0;
		char ch[]=s.toCharArray();
		for (char c : ch) {
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel++;
				break;
				
				default: conso++;
		}
	}
		System.out.println("Vowels count is: "+vowel);
		System.out.println("Consonents count is: "+conso);	
	}
}
