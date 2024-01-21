package ArrayProgram;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 20, 30, 40, 10, 10, 10 };
		System.out.println("Before sorting: ---");

		// System.out.println(Arrays.toString(a)); // only printing purpose

		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();

		Arrays.sort(a);// sort element in array
		System.out.println("After sorting:--");
		System.out.println(Arrays.toString(a));
	}

}
