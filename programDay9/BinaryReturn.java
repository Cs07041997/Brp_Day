package com.bridgelabz.programDay9;

import java.util.Scanner;

public class BinaryReturn {
	public static String binary(int a1) {
		String b =" "; // IT is used to save binary number,you can number into string
		int t=a1;//we use for safe the value of a1
		// while loop divide t until it become zero
		while(t>0) {
			int r = t%2; //it give remainder value for binary
			t=t/2; // divide use because when we use t next time it give remainder of devided val
			b=r+b;//that remainder r will add in reverse order,b is string so concate or append like word 
			
		}
		//System.out.println("Binary is "+b);
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal num");
         int a = sc.nextInt();
         System.out.println(binary(a));
	}

}
