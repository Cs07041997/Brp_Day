package com.bridgelabz.programDay14;

import java.util.Arrays;
import java.util.Scanner;

public class SortedString {
	
	public static void sorting(String[]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; i++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int size = sc.nextInt();
		System.out.println("Enter the string ");
		String[]arr1= new String[size];
		for(int i=0; i<size; i++) {
			arr1[i]=sc.next();
		}
		sorting(arr1);
		for(int i=0; i<size; i++)
			System.out.print(arr1[i]+" ");

	}

}
