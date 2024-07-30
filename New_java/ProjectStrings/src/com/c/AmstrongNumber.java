package com.c;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int n =sc.nextInt();
		int rem,arm=1;
		int temp=n;
		
		for(int i=1;i<n;i++) { 
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(arm==temp) { 
			System.out.println("Armstrong");
		}else { 
			System.out.println("not armstrong no");
		}
	}

}
