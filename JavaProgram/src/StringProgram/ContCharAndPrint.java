package StringProgram;

public class ContCharAndPrint {

	public static void main(String[] args) {
		String in="a2b3c1";
				//output :aabbbc
	
	for (int i=0;i<in.length();i++) {
		if(Character.isAlphabetic(in.charAt(i))) {
			System.out.print(in.charAt(i));
		}else {
			int x=Character.getNumericValue(in.charAt(i));
			for (int j=1;j<x;j++) {
				System.out.print(in.charAt(i-1));
			}
		}
	}
	
	}

}
