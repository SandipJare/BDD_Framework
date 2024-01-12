package StringClassProgram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountVowelsInString {

	public static void main(String[] args) {

		String str = "my name is aei";
		int count = 0;
		String onlyVowels = "";
		Set<Character> s = new LinkedHashSet<Character>();
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch + " ");
				count++;
				onlyVowels = onlyVowels + ch;
				s.add(ch);
			}
		}
		System.out.println();
		System.out.println("No of vowels in string: " + count);
		System.out.println("Vowels afetr removing:" +s);

		for (char p : onlyVowels.toCharArray()) {
			if (hm.containsKey(p)) {
				hm.put(p, hm.get(p) + 1);
			} else {
				hm.put(p, 1);
			}
		}
		Set<Character> ss = hm.keySet();
		for (Character cp : ss) {
			int value = hm.get(cp);
		//	System.out.println("char: " + cp + "::" + "Value: " + value);
		}

		 System.out.println(hm);
	}

}
