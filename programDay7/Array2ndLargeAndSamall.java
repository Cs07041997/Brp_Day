package com.bridgelabz.programDay7;

import java.util.Scanner;

public class Array2ndLargeAndSamall {
	//int 2ndsmall =0; 
	public static void num(int[]arr) {
		//that is sorting array only possible when element are non repeated 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			
			
		}
		System.out.println("second largest number is "+arr[1]);
		System.out.println("second smallest number is "+arr[arr.length-1]);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array range");
		int array1 = sc.nextInt();
		System.out.println("Enter the element");
		int[]array2= new int [array1];
		for (int i=0; i<array1; i++) {
			array2[i]=sc.nextInt();
		}
		num(array2);
        
	}

}
