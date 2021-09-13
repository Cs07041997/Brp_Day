package com.bridgelabz.programDay6;

import java.util.Scanner;

public class PrimeNoRange {
	
	public static void range(int a1) {
		int temp=0;

		for(int i=2; i<a1; i++) {
			if(a1%i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println(a1+" is prime no  ");
		}
		else {
			System.out.println(a1+"is not prime no");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int a3 = sc.nextInt();
		System.out.println("Enter the number ");
		for(int i=1; i<=a3; i++) {
			int a2 = sc.nextInt();
			range(a2);
		}
	}
}
