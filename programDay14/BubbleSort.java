package com.bridgelabz.programDay14;

import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int []arr, int nums) {
		for(int i=0; i<arr.length; i++) {
			int flag = 0;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}
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
		System.out.println("Enter the range");
		int nums=sc.nextInt();
		sort(arr,nums);
	}

} 
