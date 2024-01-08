package StringProgram;

public class SeperateCharFromString {

	public static void main(String[] args) {

		String str = "sandip123@#$";
		String alphabet="";
		String digit="";
		String specChar="";
		
		for (char str1:str.toCharArray()){
			if(Character.isAlphabetic(str1)) {
				alphabet=alphabet+str1;
			}else if(Character.isDigit(str1)) {
				digit=digit+str1;
			}else {
				specChar=specChar+str1;
			}
			}
		System.out.println(alphabet);
		System.out.println(digit);
		System.out.println(specChar);
		}
		
	}


