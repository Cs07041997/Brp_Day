package com.bridgelabz.programDay10;

import java.util.Scanner;

public class MaxStatic {
	
	public static int max(int[] num) {
		int maximum = 0;
		for(int i=0; i<num.length; i++) {
			int temp=0;
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					maximum=num[i];
					temp++;
					break;
				}
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int size = sc.nextInt();
		//System.out.println(max(a));
		int [] arr = new int[size];
		System.out.println("Enter aray element");
		for(int i=0; i<size; i++) {
			arr [i] =  sc.nextInt();
		}
		sc.close();
		System.out.println("Maximum is: ");
		System.out.println(max(arr));
	}
	
}
