package StringClassProgram;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConuntDuplicateChar {

	public static void main(String[] args) {

		// 2)Write java program count duplicate character
		String a = " welcome tooo Interview";
		a = a.replace(" ", "");

		Set<Character> s = new LinkedHashSet<Character>();
		ArrayList<Character> arr = new ArrayList<Character>();
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (char c : a.toCharArray()) {

			arr.add(c);
		}

		for (char c : a.toCharArray()) {
			s.add(c);
		}

		for (char c : a.toCharArray()) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entry = mp.entrySet();
		for (Entry<Character, Integer> eset : entry) {

			if (eset.getValue() > 1) {
				System.out.println("duplicates char and counts: " + eset.getKey() + " ::" + eset.getValue());
			}
		}

		// System.out.println("char count :" + mp);

		// System.out.println(s);
		// System.out.println(arr);

		int arrSize = arr.size();
		int setSize = s.size();

		// System.out.println("duplicates no of char: " + (arrSize - setSize));

	}

}
