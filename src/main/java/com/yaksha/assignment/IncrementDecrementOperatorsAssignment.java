package com.yaksha.assignment;

public class IncrementDecrementOperatorsAssignment {

	public static void main(String[] args) {

		// Declare a variable
		int count = 5;

		// Perform increment and decrement operations
		System.out.println("Pre-increment: " + (++count)); // Increments before printing
		System.out.println("Post-increment: " + (count++)); // Prints first, then increments
		System.out.println("Pre-decrement: " + (--count)); // Decrements before printing
		System.out.println("Post-decrement: " + (count--)); // Prints first, then decrements
	}
}
