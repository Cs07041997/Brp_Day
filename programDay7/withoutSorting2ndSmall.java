package com.bridgelabz.programDay7;

import java.util.Scanner;

public class withoutSorting2ndSmall {
	
	int smallest = Integer.MAX_VALUE;
	int secondSmallest = Integer.MAX_VALUE;//concept for find second smallest
	public  int secondsmallestLargest(int[]arr) {
		if(arr.length==0 || arr.length==1) {
			return secondSmallest;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(smallest>arr[i]) {
				secondSmallest=smallest;
				smallest = arr[i];
			}
			
			if((smallest<arr[i])&&(secondSmallest>arr[i])) {
			   secondSmallest=arr[i];	
			}
		}
		return secondSmallest;
		
		
	}
	

	public static void main(String[] args) {
		withoutSorting2ndSmall ws = new withoutSorting2ndSmall();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array range");
		int array1 = sc.nextInt();
		System.out.println("Enter the element");
		int[]array2= new int [array1];
		for (int i=0; i<array1; i++) {
			array2[i]=sc.nextInt();
		}
		System.out.println("second Smallest num is "+ws.secondsmallestLargest(array2));

	}

}
