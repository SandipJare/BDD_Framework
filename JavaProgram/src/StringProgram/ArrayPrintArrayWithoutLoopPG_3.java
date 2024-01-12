package StringProgram;

import java.util.Arrays;

public class ArrayPrintArrayWithoutLoopPG_3 {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		int b[] = a.clone();

		// Print all array value without using Loops
		System.out.println(Arrays.toString(b));

	}

}
