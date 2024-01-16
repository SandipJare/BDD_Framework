package StringClassProgram;

public class ReveseString {

	public static void main(String[] args) {


		String str="my name is sandip";
	//	out=sandip is name my;

		String [] str1=str.split(" ");

		for (int i=str1.length-1;i>=0;i--){

		System.out.print(str1[i]+" ");
		}
	}

}
