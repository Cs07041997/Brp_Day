package com.bridgelabz.programDay9;

import java.util.Scanner;

public class AddBooleanPrime {
	int temp;
	boolean isPrime=true;
	public boolean prime(int num) {
		if(num==0 || num ==1) {
			return false;
		}
		else {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					temp++;		
					break;
				}
			}
		}
		if(temp==0 && temp!=1) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		AddBooleanPrime abp = new AddBooleanPrime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println(abp.prime(a));
			
		

	}

}
