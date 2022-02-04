package com.cts.stringDemo;

public class RemoveCharString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaaabaaaaac";
		char ch='a';
		System.out.println("Original String is: "+str);
		System.out.println("remove character is: "+ch);
		RemoveCharString rcs=new RemoveCharString();
		rcs.removechar(str,ch);
	}

	public void removechar(String str, char ch) {
			System.out.print("After remove character of a string is: ");
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ch) {
			System.out.print(str.charAt(i));
			}
		}
		
	}

}
