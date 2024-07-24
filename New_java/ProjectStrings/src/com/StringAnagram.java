package com;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String str = "Apple";
		String str1="pplea";
		str.toLowerCase();
		str1.toLowerCase();
		
		
		if(str.length()==str1.length()) { 
			char[] ch=str.toCharArray();
			char[] ch1=str.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1)) { 
				System.out.println("Anagram");
			}else { 
				System.out.println("not anagram");
			}
		}
	}

}
