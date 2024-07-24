package com.n;

public class ParamidNumbers {
	public static void main(String[] args) {
		
		int size =5;
		
		for(int i=0;i<size;i++) { 
			for(int j=size;j>=i+1;j--) { 
				System.out.print("");
			}
			for(int j=1;j<=i;j++) { 
				System.out.print(j);
			}
			System.out.println("");
			
		}
	}

}
