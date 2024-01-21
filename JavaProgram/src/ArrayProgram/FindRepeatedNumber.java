package ArrayProgram;

public class FindRepeatedNumber {

	public static void main(String[] args) {

		int a[] = { 10, 20, 20, 30, 40, 10,10,10 };
		int count = 0;
		int num = 20;

		for (int val : a) {

			if (val == num) {
				count++;
			}
		}
		System.out.println("Repeated number count is :--> "+num +": "+count);
	}

}
