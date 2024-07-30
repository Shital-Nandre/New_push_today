package com;

import java.util.*;
public class FindVowles {
	
	public static void main(String[] args) {
		
		String str = "compuetr";
		str=str.toUpperCase();
		
		int Vowles=0,Consonent=0;
		
		for(int i=0;i<str.length();i++) { 
			char ch=str.charAt(i);
			if(ch=='A'||ch=='I'||ch=='O'||ch=='U'||ch=='e') { 
				Vowles++;
				
			}else { 
				Consonent++;
			}
		}
		System.out.println("consonent count:"+Vowles);
		System.out.println("vowles count:"+Consonent);
		
		
		
		
	}

}
