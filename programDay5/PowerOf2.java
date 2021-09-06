package com.bridgelabz.programDay5;

import java.util.Scanner;

public class PowerOf2 {
	public void table(int n) {
		int r = 0;
		for(int i=1; i<=n; i++) {
			r=i*2;
			System.out.print(" table of two is: ");
			System.out.println(" "+r);
		}
		
	}

	public static void main(String[] args) {
		PowerOf2 p = new PowerOf2();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        p.table(n);
	}
}
