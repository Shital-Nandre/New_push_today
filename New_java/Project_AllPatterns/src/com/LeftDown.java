package com;

public class LeftDown {
	
	public static void main(String[] args) {
		int size=5;
		
		for(int i=5;i>=1;i--) { 
			for(int j=0;j<i;j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
