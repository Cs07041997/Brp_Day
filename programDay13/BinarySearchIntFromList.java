package com.bridgelabz.programDay13;

import java.util.Scanner;

public class BinarySearchIntFromList {
	
	public static int binarySearch(int[]nums, int key) {
		
		int low = 0;
		int high=nums.length-1;
		while(low<high) {
			int mid =(high+low)/2;
			if(nums[mid]==key) {
				return mid;
			}
			if(key<nums[mid]) {
				high=mid-1;
			}
			else {
				low = mid+1;
			}
		}
			
		return -1;
		   
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int size = sc.nextInt();
			
		System.out.println("enter the element");
		int []arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp ;
		   for (int i=0; i<arr.length; i++) {
			   for (int j=i+1; j<arr.length; j++) {
				   if(arr[i] > arr[j]) {
					   temp = arr[i];
					   arr[i] = arr[j];
					   arr[j] = temp;
				   }
			   }
			   }
		System.out.println("Enter the value key: ");
		int key = sc.nextInt();
		System.out.println(binarySearch(arr, key));
		
		
	}

}
