package com.c;

import java.util.Scanner;

public class PalimdromNu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int n=sc.nextInt();
		int rem,rev=0;
		
		int temp=n;
		
		while(temp>0) { 
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(n==rev) { 
			System.out.println("pamidrom number");
		}else { 
			System.out.println("not palimdrom");
		}
	}

}
