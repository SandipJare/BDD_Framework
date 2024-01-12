package StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConintTheCharinString {

	public static void main(String[] args) {

		String str = "aabbbc";

		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		for (char str1 : str.toCharArray()) {

			if (mp.containsKey(str1)) {
				int count=mp.get(str1);
				count++;
				//mp.put(str1, mp.get(str1) + 1);
				mp.put(str1, count);

			} else {
				mp.put(str1, 1);
			}
		}
		 //System.out.println(mp);
		Set<Entry<Character, Integer>> s = mp.entrySet();

		for (Entry<Character, Integer> set : s) {
			
				System.out.print(set.getKey() +""+ set.getValue());
		}

	}

}
