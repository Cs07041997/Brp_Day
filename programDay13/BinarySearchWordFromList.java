package com.bridgelabz.programDay13;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWordFromList {
	public static int binary(String[]arr, String key) {
		int low = 0;
		int heigh=arr.length-1;
		while(low<heigh) {
			int mid = (low +heigh);
			if(arr[mid].equals(key)) {
				return mid;
			}
			if(arr[mid].compareTo(key)>0) {
				low=mid+1;
			}
			else {
				heigh=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int size = sc.nextInt();
		System.out.println("Enter the string range");
		String[]arr1= new String[size];
		for(int i=0; i<size; i++) {
			arr1[i]=sc.next();
		}
		Arrays.sort(arr1);
		
		// index of word which have to search
			
		System.out.println("enter the key element");
		String key = sc.next();
		System.out.println(binary(arr1,key));

	}

}
