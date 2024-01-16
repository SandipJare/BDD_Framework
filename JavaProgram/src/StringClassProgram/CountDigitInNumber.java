package StringClassProgram;

public class CountDigitInNumber {

	public static void main(String[] args) {

		int a = 1777221;
		
		String b="1122";
		int bc=Integer.parseInt(b);
		String ab=Integer.toString(a);
		System.out.println(ab);
		System.out.println(bc);
		
		int count = 0;

		while(a>0)
		 {
				a=a/10;
				count++;
			}
			System.out.println(count);
		}
		
	}


