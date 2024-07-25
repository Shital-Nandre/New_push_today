package com;

public class ReplaceEachChara {
	
	public static void main(String[] args) {
		
		String str ="avaj rats";
		
	  String[] Words=str.split(" ");
	  String output=" ";
	  
	  for(String word:Words) { 
		  
		  String replaceword=" ";
		  for(int i=word.length()-1;i>=0;i--) { 
			  
			  replaceword=replaceword+word.charAt(i);
		  }
		  output=output+replaceword+" ";
		  
	  }
	  System.out.println(output);
	}

}
