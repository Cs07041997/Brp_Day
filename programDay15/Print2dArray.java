package com.bridgelabz.programDay15;

import java.util.Scanner;

public class Print2dArray {
	
	public static void array(int [][]arr) {
		 int  i, j;
		 //int arr[][] = new int[row][col];
		 System.out.print("The Array is :\n");
		    for (i = 0; i < arr.length; i++) {
		      for (j = 0; j < arr.length; j++) {
		        System.out.print(arr[i][j] + "  ");		       
		      }
		      System.out.println();
		    }		   	
	}

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    // enter row and column for array.
		    System.out.print("Enter row for the array  : ");
		   int row = scan.nextInt();
		    System.out.print("Enter column for the array  : ");
		   int col = scan.nextInt();
		   int arr[][] = new int[row][col];
		    // enter array elements.
		    System.out.println("Enter " + (row * col) + " Array Elements : ");
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < col; j++) {
		       arr[i][j] = scan.nextInt();
		      }
		    }

		    // the 2D array is here.
		    array(arr);
		  }

	}


