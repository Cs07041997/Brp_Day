package com.bridgelabz.programDay6;

import java.util.Random;
import java.util.Scanner;

public class RollDice {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number of times dice throw");
        int x = random.nextInt(6);
        System.out.println(x);
	}

}
