package com.bridgelabz.programDay7;

import java.util.Scanner;

public class PrimeFactorization {

	public void factor(int n) {
	  for(int i=2; i<=n; i++) {
		  if(n%i==0) {
			  System.out.println("f is "+i);
		  }
	  }
	  System.out.println("factorization is"+n);
		
	}

	public static void main(String[] args) {
		PrimeFactorization pf = new PrimeFactorization();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num for prime factor");
        int a = sc.nextInt();
        pf.factor(a);
        
	}


}
