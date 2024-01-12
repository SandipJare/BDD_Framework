package StringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListProgram {

	public static void main(String[] args) {

		int[] a = { 40, 30, 60, 50, 0, 0, 60, 0 };
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> ls = new ArrayList<Integer>();
		List<Integer> ls1 = new ArrayList<Integer>();
		Set<Integer> s = new LinkedHashSet<Integer>();

		for (Integer p : a) {
			if (0 != p) {
				ls.add(p);
			} else {
				ls1.add(p);
			}
		}
		System.out.println(ls);
		System.out.println(ls1);
		ls1.addAll(ls);
		System.out.println(ls1);
		List<Integer> nls = new ArrayList<Integer>(Arrays.asList(40, 30, 60, 50, 0, 0, 60, 0));
		System.out.println(nls);

		for (Integer num : nls) {
			s.add(num);
		}
		System.out.print("Set: " +s);
		for (int i = 0; i < a.length; i++) {

			l.add(a[i]);
		}
		System.out.println("ArrayList: "+ l);
	}

}
