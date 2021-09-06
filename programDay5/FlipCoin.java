package com.bridgelabz.programDay5;

import java.util.Scanner;

public class FlipCoin {
	public void coin(int numOfFlip) {
	int	head = 0; int tail = 0;
	double side = Math.random();
	for(int i=0; i<numOfFlip; i++) {
		if(side>0.5) {
			head++;
		}
		else {
			tail++;
		}
	}
		System.out.println(head+ " number of head");
		System.out.println(tail+ " number of tail");
		double percentage1;
		double percentage2;
		percentage1 = (head*100)/numOfFlip;
		percentage2 = (tail*100)/numOfFlip;
		System.out.println("percentage of head "+percentage1);
		System.out.println("percentage of tail "+percentage2);
	}
	
	public static void main(String[] args) {
		FlipCoin fc = new FlipCoin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of flipcoin");
		int numOfFlip = sc.nextInt();
		fc.coin(numOfFlip);

	}

}
