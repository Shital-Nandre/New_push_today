package com;

public class EvenLength {
	
	public static void main(String[] args) {
		
		String  str = "i am java for Quick learning and learner";
		
		for(String word:str.split(" ")) { 
			if(word.length()%2==0) { 
				System.out.println(word);
			}
			
		}
	}

}
