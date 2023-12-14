package com.cgi.b3;

import java.util.Scanner;

public class KeyBoardInput {

	public static void main(String[] args) {
		System.out.println("This prints on console");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number");
		int x = sc.nextInt();
		System.out.println("number is " + x);
		
		System.out.println("Input a String");
		String x1 = sc.next();
		System.out.println("String is " + x1);
		System.out.printf("Number is : %d \n, String is %s", x,x1);
		

	}

}
