package StringClassProgram;

public class StringMultiplication {

	public static void main(String[] args) {
		int a = Stringmultiplication("six");
		int b = Stringmultiplication("two");

		int c = a * b;
		
		System.out.println(c);
	}

	public static int Stringmultiplication(String str) {

		String str1 = "two";
		String str2 = "four";

		switch (str.toLowerCase()) {
		case "one":
			return 1;

		case "two":
			return 2;

		case "three":
			return 3;

		case "four":
			return 4;

		case "five":
			return 5;

		case "six":
			return 6;

		case "seven":
			return 7;

		case "eight":
			return 8;
		case "nine":
			return 9;

		default:
			throw new IllegalArgumentException("invalid input: " + str);

		}

	}

}
