package StringClassProgram;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Mumbai";

		char[] b = str.toCharArray();

		for (int i = b.length - 1; i >= 0; i--) {
			// System.out.println(b[0]);
			System.out.print(b[i]);
			System.out.print("");
		}

		System.out.println("\n----------------------");
		for (int i = b.length - 1; i >= 0; i--) {
			// System.out.println(b[0]);
			System.out.print(str.charAt(i));
		}

		System.out.print(" ");

		System.out.println("\n----------------------");

		System.out.println(str.substring(2));

		System.out.println("\n----------------------");

		System.out.println(str.substring(2,4));
	}
}
