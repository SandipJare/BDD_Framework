package StringProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number to becheck:--> ");
		int number = sc.nextInt();

		if (isPrime(number) == true) {
			System.out.println("The number is prime ");
		} else {
			System.out.println("Number is not prime");
		}
	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}

}
