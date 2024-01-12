package StringClassProgram;

public class StringSpltMethod {

	public static void main(String[] args) {

		String str = "rachin ravindra 'new' player 'csk' ";
		
		String [] c=str.split("'");
		
		for (String p:c) {
			System.out.println(p.trim());
		}

		int a=100;
		Integer b=a;
		int d=100;
		System.out.println(a==d);
		System.out.println(b.equals(d));
	}

}
