package StringProgram;

public class AdditionOfDigitInNumber {

	public static void main(String[] args) {

		int b = 111;
		int sum = 0;

		while (b > 0) {

			int digit = b % 10;

			sum = sum + digit;

			b = b / 10;
		}
		System.out.println(sum);
	}

}
