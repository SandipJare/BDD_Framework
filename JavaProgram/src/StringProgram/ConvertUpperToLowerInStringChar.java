package StringProgram;

public class ConvertUpperToLowerInStringChar {

	public static void main(String[] args) {

		String str = "India is My country";
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			char charArray = c[i];
			if (Character.isUpperCase(charArray)) {
				c[i] = Character.toLowerCase(charArray);
			} else if (Character.isLowerCase(charArray)) {
				c[i] = Character.toUpperCase(charArray);
			}
		}

		String result = new String(c);

		System.out.println(result);
	}

}
