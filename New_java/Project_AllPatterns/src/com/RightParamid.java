package com;

public class RightParamid {
	public static void main(String[] args) {
		
		int size=5;
		
		for(int i=0;i<size;i++) { 
			for(int j=1;j<size-i;j++) { 
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++) { 
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
