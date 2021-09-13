package com.bridgelabz.programDay8;

import java.util.Scanner;

public class StringPallindrome {
	
	public void pallindrome(String a1) {
		//
		String org = "str";
		String rev ="";
		for(int i=a1.length(); i>=0; i--) {
			rev = rev+a1.charAt(i);
		}
		
		if(a1.equals(rev)) {
			System.out.println("num is pallindrome ");
		}
		else {
			System.out.println("not pallindrome ");
		}
	}

	public static void main(String[] args) {
		StringPallindrome sp = new StringPallindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = sc.nextLine();
		sp.pallindrome( a);

	}

}
