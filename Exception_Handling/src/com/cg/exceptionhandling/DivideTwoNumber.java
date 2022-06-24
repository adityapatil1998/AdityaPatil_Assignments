package com.cg.exceptionhandling;

import java.util.Scanner;

public class DivideTwoNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("The numarator is :");
			int numarator = sc.nextInt();

			System.out.println("The denominator is :");
			int denominator = sc.nextInt();
			sc.close();

			double division = numarator / denominator;

			System.out.println("The division of two number is :" + division);

		}

		catch (ArithmeticException e) {
			System.out.println("divide by zero is not acceptable");
		}

	}

}
