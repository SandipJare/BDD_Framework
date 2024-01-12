package StringClassProgram;

import java.util.HashMap;
import java.util.Map;

public class MapDemoQ {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put(null, "value1");

		map.put("1", "value2");

		map.put(null, "null");

		System.out.println(map);

	}

}
