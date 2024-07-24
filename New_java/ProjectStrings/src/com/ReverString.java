package com;

public class ReverString {
	public static void main(String[] args) {
		
		String str = "shital";
		
		for(int i=str.length()-1;i>=0;i--) { 
			System.out.print(str.charAt(i));
		}
	}

}
