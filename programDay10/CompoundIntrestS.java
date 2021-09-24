package com.bridgelabz.programDay10;

import java.util.Scanner;

public class CompoundIntrestS {
	
	public static double value(int c, int r, int t) {
		double A=0;
		A=c*Math.pow((1+r), t);
		return A;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter compound intrest");
		int comp = sc.nextInt(); 
		System.out.println("Enter the rate");
		int rate = sc.nextInt();
		System.out.println("Enter time period");
		int time = sc.nextInt();
		System.out.println("Amount of money is "+value(comp,rate,time));
	}

}
