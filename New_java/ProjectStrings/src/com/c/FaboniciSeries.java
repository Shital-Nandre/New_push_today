package com.c;

import java.util.Scanner;

public class FaboniciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		
		int FirstNumber=0,SecondNumber=1;
		int NextNumber;
		for(int i=0;i<=n;i++) { 
			System.out.println(+FirstNumber);
			NextNumber=FirstNumber+SecondNumber;
			FirstNumber=SecondNumber;
			SecondNumber=NextNumber;
		}
	}

}
