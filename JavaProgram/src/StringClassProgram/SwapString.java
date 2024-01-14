package StringClassProgram;

public class SwapString {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		String c="Namste";
		
		c=c.substring(2);
		System.out.println(c);
		
		System.out.println("before swap a:" +a);
		System.out.println("before swap b:" +b);
		
		a=a+b;
		
		System.out.println(a);
		/*
		str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
		
		*/
		
		b=a.substring(0,a.length()-b.length());
		
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		
		a=a.substring(b.length());
		
		System.out.println("afetr swap a:" +a);
		System.out.println("afetr swap b:" +b);
		
		
		

	}

}
