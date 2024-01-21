package StringProgram;

import java.util.Scanner;

public class PrimeNumberGenerator  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the limit for prime numbers: ");
		int limit = scanner.nextInt();

		System.out.println("Prime numbers up to " + limit + " are:");
		printPrimeNumbers(limit);

		scanner.close();
	}

	// Function to print prime numbers up to a given limit
	private static void printPrimeNumbers(int limit) {
		for (int num = 2; num <= limit; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}

	// Function to check if a number is prime
	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		// Check for divisibility from 2 to the square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // Not a prime number
			}
		}

		return true; // Prime number
	}
}
