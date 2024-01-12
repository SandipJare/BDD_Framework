package StringProgram;

public class Demo3 {
	// declare the static method without return type and 1 String args
		// and perform reverse String

		public static void findReverseString(String a) {

			char[] abc = a.toCharArray();

			for (int i = abc.length-1; i >=0; i--) 
			{
				System.out.print(abc[i]);
			}
		}

		public static void main(String[] args) {

			Demo3.findReverseString("madam");

		}
}
