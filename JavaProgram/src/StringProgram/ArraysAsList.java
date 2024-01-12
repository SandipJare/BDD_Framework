package StringProgram;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		String[] abc = new String[5];

		abc[0] = "selenium";
		abc[1] = "TestNG";
		abc[2] = "Cucumber";
		abc[3] = "POM";
		abc[4] = "Jenkins";

		// check specific value is present or not in array
		boolean a = Arrays.asList(abc).contains("Cucumber");
		System.out.println(a);

		List<String> ls=Arrays.asList(abc);
		System.out.println(ls);

	}

}
