package com.bridgelabz.programDay16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valid Email");
		String email = sc.next();
		Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher m = p.matcher(email);
		boolean b = m.matches();
		System.out.println("Enter First Name");
		String firstName = sc.next();
		Pattern p1 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher m1 = p1.matcher(firstName);
		boolean b1 = m1.matches();
        System.out.println(b1);
        System.out.println("Enter Last Name");
		String lastName = sc.next();
		Pattern p2 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher m2 = p2.matcher(lastName);
		boolean b2 = m2.matches();
        System.out.println(b2);
        System.out.println("Enter Mobile number");
		String mobileNumber = sc.next();
		Pattern p3 = Pattern.compile("^[9][1][-][0-9]{10}$");
		Matcher m3 = p3.matcher(mobileNumber);
		boolean b3 = m3.matches();
        System.out.println(b3);
        System.out.println("Enter Id");
        String id = sc.next();
        Pattern p4 = Pattern.compile("^[A-Za-z0-9+_]+{1,2,3}$");
		Matcher m4 = p.matcher(id);
		boolean b4 = m4.matches();
	}
}
