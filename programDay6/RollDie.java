package com.bridgelabz.programDay6;

import java.util.Scanner;

public class RollDie {
	public void dice(int n) {

		int large = 0;// i need positive value so we initialize with 0, if we need +ve and -ve
		//int large = Integer.MIN_VALUE;//if we need +ve and -ve value
		//int small = Integer.MAX_VALUE;
		int side =0 ;
		for(int i=1; i<=n; i++) {
			side =(int)((Math.random()*6)+1);//we put side' into loop for iterate n times
			System.out.println(side+" is random number");
			// use of 'if' for compare a value with every value and give result
			if (side>large) {
				large = side;
			}
		}
		System.out.println("greater num is "+large);
	}
	
	public static void main(String[] args) {
		RollDie rd = new RollDie();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		rd.dice(n);
		sc.close();
	}
}
