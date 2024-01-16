package StringClassProgram;

public class RemoveSpace {

	public static void main(String[] args) {
		//remove white space
		String a = "  .  Welcome to Interview  ";

		System.out.println(a.trim());

		a.replaceAll(".", "");

		System.out.println(a);

		// . Welcome to Interview
	}

}
