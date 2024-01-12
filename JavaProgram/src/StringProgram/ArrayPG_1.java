package StringProgram;

public class ArrayPG_1 {

	public static void main(String[] args) {

		String[] str = { "cucumber", "java", "testng", "selenium" };
		String a = "";
		for (String s : str) {
			// System.out.println(s);
		}

		for (int i = 0; i < str.length; i++) {

			if (str[i].equals("cucumber")) {
				a = str[i];
			}
		}
		
		for (int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}

}
