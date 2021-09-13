package com.bridgelabz.programDay6;

import java.util.Scanner;

public class FindRepeatInArr {
	
	public static int repeat(int[]arr1) {
		int count = 0,i=0,j=i+1;
		for ( i=0;i<arr1.length-1;i++) {
			for( j=i+1; j<arr1.length;j++) {
				if((arr1[i]==arr1[j])&&(i != j)) {
					count++;
					//System.out.println("duplicate element is "+arr1[j]);	
				}
				//count++;
				
			}
		}
		return arr1[j];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of array: ");
		int size=sc.nextInt();
		int []array =new int [size];
		System.out.println("enter element");
		for(int i=0;i<=size;i++) {
			array[i] = sc.nextInt();
		}
			//System.out.println("duplicate"+repeat(array));
		System.out.println("duplicate is "+repeat(array));
		}
		

}
