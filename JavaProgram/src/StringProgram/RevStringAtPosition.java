package StringProgram;

public class RevStringAtPosition {

	public static void main(String[] args) {

		String str = "My Name is Akshay";
		//output = "yM emaN si yahskA" ;
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			for (int j = str1[i].length() - 1; j >= 0; j--) {

				System.out.print(str1[i].charAt(j));
			}
			System.out.print(" ");
		}
		//System.out.println(str1.length);

	}

}
