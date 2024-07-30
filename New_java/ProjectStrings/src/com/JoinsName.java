package com;

public class JoinsName {
	
	public static void main(String[] args) {
		
		// excpected ouput will be Shital-Nandre
		
		String str = "Java Language";
		String[] str1=str.split(" ");
		  System.out.println(str.join("-", str1));
		
	}

}
