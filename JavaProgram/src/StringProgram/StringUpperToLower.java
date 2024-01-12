package StringProgram;

public class StringUpperToLower {

	public static void main(String[] args) {
		String str = "India is MY Country";
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char currentChar = charArray[i];

			if (Character.isUpperCase(currentChar)) {
				// If the character is uppercase, convert to lowercase

				charArray[i] = Character.toLowerCase(currentChar);

			} else if (Character.isLowerCase(currentChar)) {
				// If the character is lowercase, convert to uppercase

				charArray[i] = Character.toUpperCase(currentChar);
			}
		}

		// Convert the char array back to a string
		String result = new String(charArray);

		// Print the result
		System.out.println("Original String: " + str);
		System.out.println("After swapping case: " + result);
	}

}
