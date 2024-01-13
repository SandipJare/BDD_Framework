package StringClassProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SumOfObejctInArray {

	public static void main(String[] args) {

		int[] a = { 10,20,60,50 };
		int sum = 0;

		List<Integer> arr = new ArrayList<Integer>();
		Set <Integer> set=new LinkedHashSet<Integer>();

		for (int b : a) {
			arr.add(b);
			set.add(b);
		}

		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		int maxNum = Collections.max(set);
		System.out.println(maxNum);
		int minNum = Collections.min(set);
		System.out.println(minNum);

		for (int i = 0; i < a.length; i++) {
			// arr.add(a[i]);
			if(i%2==0) {
			sum = sum + a[i];
			}
		}
		System.out.println("Sum of even array element before sort: "+sum);
		
		System.out.println("Third largest number: "+ arr.get(set.size()-3));
		System.out.println(set);
		int ArraySize=arr.size();
		int SetSize=set.size();
		int totalDuplicate=ArraySize-SetSize;
		System.out.println("Total duplicate nos are: "+ totalDuplicate);
	}

}
