package StringClassProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfObejctInArray {

	public static void main(String[] args) {

		int[] a = { 60, 70, 10, 20, 30, 40, 50 };
		int sum = 0;

		List<Integer> arr = new ArrayList<Integer>();

		for (int b : a) {
			arr.add(b);
		}

		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		int maxNum = Collections.max(arr);
		System.out.println(maxNum);
		int minNum = Collections.min(arr);
		System.out.println(minNum);

		for (int i = 0; i < a.length; i++) {
			// arr.add(a[i]);
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		System.out.println("Third largest numb"+ arr.get(arr.size()-3));
	}

}
