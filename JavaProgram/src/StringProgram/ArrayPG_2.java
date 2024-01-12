package StringProgram;

public class ArrayPG_2 {

	public static void main(String[] args) {

		String[] str = { "cucumber", "java", "testng", "selenium" };

		System.out.println(str.length);
		
		for (int i = 0; i < str.length; i++) {
			String a = str[i];
			for (int j = a.length() - 1; j >= 0; j--) {
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
