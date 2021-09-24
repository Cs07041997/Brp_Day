package com.bridgelabz.programDay10;

import java.util.Scanner;

public class CheckCollinear {
	
	public static  boolean collinear(int x1, int y1, int x2, int y2, int x3, int y3) {
		double AB= (y2 -y1)/(x2-x1);
		double BC= (y3 -y2)/(x3-x2);
		double CA= (y1 -y3)/(x1-x3);
		if(AB==BC && BC==CA) {
			//System.out.println("num is collinear");
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X1: ");
		int x1 = sc.nextInt();
		System.out.println("Enter the Y1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter the X2: ");
		int x2 = sc.nextInt();
		System.out.println("Enter the Y2: ");
		int y2 = sc.nextInt();
		System.out.println("Enter the X3: ");
		int x3 = sc.nextInt();
		System.out.println("Enter the Y3: ");
		int y3 = sc.nextInt();
		System.out.println("  "+collinear(x1, y1, x2, y2, x3, y3));
	}
}
