package com.bridgelabz.programDay9;

import java.util.Scanner;

public class SqrtValue {
	
	public static double sqrt(double c) {
		if(c<0)
			return Double.NaN;
		double EPSILON=1E-15;
		double t=c;
		while(Math.abs(t-c/t)>EPSILON*t){
			t=(c/t+t)/2.0;
		}
		return t;
	}
	
	public static double sqrt(double c, double eplison) {
		if(c<0)
			return Double.NaN;
		double t=c;
		while(Math.abs(t-c/t)>eplison*t) {
			t=(c/t+t)/2.0;
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int size = sc.nextInt();
		// parse command-line arguments
        double[] a = new double[args.length];
        for (int i = 0; i < size; i++) {
            a[i] = Double.parseDouble(args[i]);
        }

        // compute square root for each command line parameter
        for (int i = 0; i < size; i++) {
            double x = sqrt(a[i]);
            System.out.println(x);
        }

	}

}
