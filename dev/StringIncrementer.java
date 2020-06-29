package com.example.pack;

public class StringIncrementer {
	
	public static void main(String args[]) {
		System.out.println("test");
		String[] str = {"AAAB","AAZA", "AAAZ", "AZZA", "AAZZ", "AZZZ"};
		for(String s: str)
			System.out.println(s+"=>"+increment(s));
	}
	
	public static String increment(String str) {
		char[] chars = str.toCharArray();
		for(int i = chars.length-1;i>=0; i-- ) {
			if(chars[i] != 'Z') {
				chars[i] += 1;
				break;
			}
			else {
				chars[i] = 'A';
			}
			
		}
		return new String(chars);
	}

}
