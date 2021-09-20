package com.bridgelabz.programDay9;

import java.util.Scanner;

public class StaticFunction {
	
	public static long factorial(int n) {
		int f=1;
		int count=0;
		for(int i=1; i<=n; i++) {
			System.out.print(i +" * ");
			//f=f*i;
			count++;
		}
		return f;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println(" = "+factorial(a)+"! " );
	}
}
