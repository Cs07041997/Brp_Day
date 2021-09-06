package com.bridgelabz.programDay5;

import java.util.Scanner;

public class GamblerSimulateor {
	
	public static void gambler(int trials, int stake, int goal) {
	        int bets = 0;        // total number of bets made
	        int wins = 0;        // total number of games won
			// repeat trials times
	        for (int t = 0; t < trials; t++) {
				// do one gambler's ruin simulation
	            int cash = stake;
	            while (cash > 0 && cash < goal) {
	                bets++;
	                if (Math.random() < 0.5)
	                	cash++;     // win re 1
	                else   
	                	cash--;     // lose re 1
	            }
	            if (cash == goal) wins++;                // did gambler go achieve desired goal?
	        }

	        // print results
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	    }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the time of stack");
			int stake  = sc.nextInt();
			System.out.println("Enter the time of goal");
	        int goal   = sc.nextInt();
	        System.out.println("Enter the time of trail");
	        int trials = sc.nextInt();
	        gambler(trials, stake, goal);
	   	}
}
