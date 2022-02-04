package com.cts.stringDemo;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="rajan";
		String s2="krishna";
		String s3="RAJAN";
		
		System.out.println(s1.charAt(1));				// a				//	char charAt(int index)
		System.out.println(s1.compareTo(s2));			// 7				//	int compareTo(String anotherString) 
		System.out.println(s1.concat(s2));				// rajankrishna		//	String concat(String str)
		System.out.println(s1.contains("rajan"));		// true				//	boolean contains(CharSequence s)
		System.out.println(s1.endsWith("n"));			// true				//	boolean endsWith(String suffix) 
		System.out.println(s1.equals(s2));				// false			//	boolean equals(Object another)
		System.out.println(s1.equalsIgnoreCase(s3));	// true				//	boolean equalsIgnoreCase(String another)
		System.out.println(s1.format("name is %s",s1));	// name is rajan	//	static String format(String format, Object... args)
		byte[] b = s1.getBytes();  						// 114 97 106 97 110//	byte[] getBytes()
        for(int i=0;i<b.length;i++){  
            System.out.println(b[i]);  }  
        char[] ch = new char[10];
        s1.getChars(2, 4, ch, 0);
        System.out.println(ch);							// ja				//	void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex) 
		System.out.println(s1.indexOf("j"));			// 2				//	int indexOf(int ch)	
		String s4=new String("hari");
		String s5=s1.intern();
		System.out.println(s4==s5);						// true				//	String intern()
        System.out.println(s1.isEmpty());				// true				//	boolean isEmpty()
        System.out.println(s1.join("/", "18","05","1993"));	// 18/05/1993	//	static String join(CharSequence delimiter, CharSequence... elements)
        System.out.println(s1.lastIndexOf("a"));		// 					//	int lastIndexOf(int ch)
        System.out.println(s1.length());				//	5				//	int length()
        System.out.println(s1.replace("an", "u"));		// raju				//	String replace(char old, char new)
        System.out.println(s1.replaceAll("a", "e"));	// rejen			//	String replaceAll(String regex, String replacement) 
        String s6="string split method";				// string
        for (String s : s6.split("\\s")) {				// split
        	System.out.println(s);						// method			//	String split(String regex)
		}
        System.out.println(s1.startsWith("r"));			// true				//	boolean startsWith(String prefix)
		System.out.println(s1.substring(2));			// jan				//	String substring(int beginIndex)
		System.out.println(s1.substring(1,3));			// aj				//	String substring(int beginIndex, int endIndex)
		char[] cha=s1.toCharArray();
		for (int i=0; i< cha.length; i++) {
			System.out.println(cha[i]);					// r a j a n		//	char[] toCharArray()
		}
		System.out.println(s1.toLowerCase());			// rajan			//	String toLowerCase()
		System.out.println(s1.toUpperCase()); 			// RAJAN			//	String toUpperCase()
		String s7=" rajan ";
		System.out.println(s7.trim()+"krishna");		// rajanrajan		//	String trim() 
		int a=10;
		System.out.println(s1.valueOf(a));				// 10				//	static String valueOf(int value)
		
	}

}
